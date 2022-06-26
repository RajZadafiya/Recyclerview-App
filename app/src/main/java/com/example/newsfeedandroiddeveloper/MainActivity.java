package com.example.newsfeedandroiddeveloper;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.os.Bundle;

import com.example.newsfeedandroiddeveloper.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    RecyclerView.LayoutManager layoutManager;
    ArrayList<News> news;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        layoutManager = new LinearLayoutManager(this);
        binding.recycleview.setLayoutManager(layoutManager);

        prepare_news();
    }

    public void prepare_news(){
        news = new ArrayList<>();

        news.add(new News("https://miro.medium.com/max/1200/1*xsir-fypCq_LrbK5jjyN9w.jpeg" ,"Youtube","Machine Learning Week","Machine learning is an application of artificial intelligence (AI) that provides systems the ability to automatically learn and improve from experience without being explicitly programmed. Machine learning focuses on the development of computer programs that can access data and use it to learn for themselves.",
            "https://miro.medium.com/max/1200/1*xsir-fypCq_LrbK5jjyN9w.jpeg","Youtube","5 Jan 2022"));

         news.add(new News("https://i.pinimg.com/originals/37/2d/7c/372d7caa175be89e8d5d4bd2ec2a371f.png","Youtube","Machine Learning Week","Machine learning is an application of artificial intelligence (AI) that provides systems the ability to automatically learn and improve from experience without being explicitly programmed. Machine learning focuses on the development of computer programs that can access data and use it to learn for themselves.",
                "https://i.pinimg.com/originals/37/2d/7c/372d7caa175be89e8d5d4bd2ec2a371f.png","Youtube","5 Jan 2022"));
        news.add(new News("https://www.spiria.com/site/assets/files/4309/banner-zak.-large.jpg", "Youtube","Machine Learning Week","Machine learning is an application of artificial intelligence (AI) that provides systems the ability to automatically learn and improve from experience without being explicitly programmed. Machine learning focuses on the development of computer programs that can access data and use it to learn for themselves.",
                "https://www.spiria.com/site/assets/files/4309/banner-zak.-large.jpg","Youtube","5 Jan 2022"));
        /*news.add(new News("data:image/jpeg;base64,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",
                "Youtube","Machine Learning Week","Machine learning is an application of artificial intelligence (AI) that provides systems the ability to automatically learn and improve from experience without being explicitly programmed. Machine learning focuses on the development of computer programs that can access data and use it to learn for themselves.",
                "https://miro.medium.com/max/1200/1*xsir-fypCq_LrbK5jjyN9w.jpeg","Youtube","5 Jan 2022"));
        news.add(new News("data:image/jpeg;base64,/9j/4AAQSkZJRgABAQAAAQABAAD/2wCEAAkGBxMTEhUTEhMWFhUXGBkaGRgXFhgYGhwfGBoZGxgbGRoYISggGhsmGxcYITEiJSkrLi4uFx8zODMtNygtLisBCgoKDg0OGxAQGyslICUuLS0tMjAtLzUwMisvKy8vLS0tLS0yLS0tLy0tLS0tLS8tLy0vLS8tLS0tLy8tLi0tL//AABEIAMIBAwMBIgACEQEDEQH/xAAcAAACAgMBAQAAAAAAAAAAAAAAAwIEAQcIBQb/xABJEAACAQMCBAIHBAcGAgkFAAABAhEAAyESMQQiQVEyYQUGE0JxgZEHUqHRI2Jyk7HB8BQWVILh8ZKiJDNDRHODssLDFSVjs9L/xAAbAQACAwEBAQAAAAAAAAAAAAAAAgEDBQQGB//EADoRAAEDAgMFBgQFAgcBAAAAAAEAAhEhMQNBUQQSYXHwBSKBkaGxFDLB0RNSsuHxFUIGIzRicoKSM//aAAwDAQACEQMRAD8A3jRRRQhFFFFCEUUUUIRRRRQhFFFFCEUUUUIRRRRQhFFFFCEUUUUIRRRRQhFFFFCEUUUUIRRRRQhFFFFCEUUUUIRRRRQhFFFFCEUUUUIRRRXxnrJ9ofCcLqVW9tdGyWysT2L7DO8SR2pXOa0SSrcHAxMZ27htJPDqnivs6K0b6X+1HjLh/RabSdkt+0fbYlpHzEV4PD+uHHO41cXejqy3CY7cqtE9PxrndtTcgfZa+H2Djn53Acq+1PWNYXSFFcy8Z6x8VPJxXFCYwbzTsZ2bftFMt+sPGQrf2viDB29s+dJyO/Ttmaj4sRMJh2DiEkb48jbrqYnpaiuaLnrHxjMSvF348rrnbOnxb9I/h7ybfp/i2nTxXEDET7a6cxIG++/wgdzUjagckj+w8VpjeGcceS6dormvi/TvFsFReLvtAwwu3VGTnVDcxDYnpBqNz0zxoZVfjbiSOWLt6CZgKeYEnJz1gUDa26Jj2DjAjvDLW+mnkfVdLUVzTwvpz0g7D/pN2AQIXiHJJYjSJJh5/PE1G76w8YGcf2niHIMSty5pnoCNW+mORfOfKfiRoq3djPFN8TyPtfWKZHOi6Yorl236ycdBU8TxR6eO8GzMDLCTsTjYVLhvWfjSmk8TdIC6gzXrqmTsNReNMbSe1T8QNErex8QkDeAnXXSOq0XUFFcwt608YxGnieI1BAXm7cECRJ0ltU+X070236X40J7VrvFMsjbibqrE+6QeaVABiY/amj4gaKT2PiD+4eR+kyeAnPIEjpmiuaLXrfxZIQ8TcthufULt242ltkEMZ6bwcfOlcd6z8YLaTxXE+IgoLlwBlGZFxW8eOhyTt1o+IExCP6Q7cLi6IvS3PShB1INASunKK5nb03x1i2jf2m+oaf8ArLzsyzEalmF3xJGx7MK8+56wcXq5+L4pUUKrab1wkESpkho1EgbxhvqNxwcvZJidluYB3xPI04k2AFzMQK2mOqKK5i4T09xYLG5xPFlUDGPbkGBOXGsFcEYjcrWeG9YeLUlLnE8WGEidd2IAy0kzODDQfhEyfEDIKW9kPpLgJJFjccgbmQMppmF05RXMXC+tXGkaDxHEaiGn9MxJxMqZkYHlTW9Y+Je1bC8XeQjSLk3rsszEAHUDAURsDkqcUfEDMFMOx8R0brhXmNNdJrpVdMUVzPb9Z+MQL7Xib5GgEhOJuBu6kc4JwBvgxA6g3PRH2hekrVxdXE+0tEkaWC3IiBqZiAx+GrOe1SNobmEmJ2Titggg65RWKzkOE8oqujKK1V6G+163gcZaKAxF21qdIPvMp5lHaNX4Vsn0d6QtX7YuWLi3EOzIQR+HXyq1rg6y4MbAxMIw8fUeYorlFFFMqUUUUUIRSOJ4hUUu7BVUEsxMAAbkmn1pv7VvWk3Lh4W0T7O1zXCJ53UmVMe6p/5vlVeLiDDbK7Nh2N+14ww20FydALn6Diqvr56/3OIZrPDkpYBCkiVa5O4PUIdoG/Xy+M9H8MrmHf2YDDcTiMYHQkdaVqIIYY/rpP8AWazqky7xE7QczifvTP8AyVlueXVK91s+zYWzt3GCB4eZJuc/DIWWiy2khwJ+Ik9/6+mKmbSrpfOG0mFjV5nzk7edW7PDI40Kw0EZeJyNgB0memPwpFq4WK2w2VZYbAVYyCSMz0+NQBkE0gXFaXzOQGsRTlxRbj2bCedicYiJBz56sCqoYBYXVytz5UbfA4noas3NSKy88EkjB3xq5vkd9p6VBuIAaQqII7E4g7E79B02qYSE5EwYvIPI+1LieRUeHXGpdtfKzEDyP3umJbz/AGqQYcELOEYgyYYzkKT4vL/emW7TkgKFAZiVJgYiTHXInt2G9YQhXKuNUEYjY82MnxQPLv1qYixVf4m/8zaRxzrTyobxEmAmtca4QqDSmkhVCzJBOrWx3HwYbZqpcDCC2mOUwVc5AblEkyMHerF+4tv2f6Rj49S5QjUDy53En8POo/2tCjSCMgluTaR1Gd/LoKeqq3wRvSJAkCv5edqkXiGiyu+jkYC5xPtLasrLIIUxqUkMk8xA0xIkeWZqoLupXZXAKRgwpMkbAiR4QT12xuKXc4mMMXwuIKmdQ0ncSAAdoO3Si3wd24He2jcoQuFR1BUFgAT+0QCO3wqQNVW98UniZ5mDNJE+4gHOxw9jmRggvcyvcGuWIIMwxiNQZxEdB2p/H2+HvcQzoiiyxn2dt0lVEBgAQFk52jJ361R4a8bD6wuh11CQW1AEEjVHKV09pnpkZzYvHSdmZ4Yqg5wpYlSDPK2Yxtiith15JtzDJJcKjjSuUET6EzvJvpO0pukcPy2SRoDsSwUjf2mwEgiB0NQ47jOIKW7bXQVsksiwAokguECiXnUDv171W4rACwCqqiwInlyST94hjTwr+yVS45VK6NQhRch4AzA8BMbEtigHPVVvHegSdwamkUtWeBnUxkUcOluNLaAzQyFFlpbcNAlRpyE2/jRxbhn9nBFuOXScqCCAWBwcHEe7SLlokIVQzJXH7OWCjEDv5nvT+Fa+AGC22UygCkOAcdO8A52APamgXnrqyRr32DKSKgTLb15kyaZjQlMvM0Ql72hjUSXUqNKiSV8QESBnrNZ4/h2sDQQpQmSoKgxEglt5kGcxg1niuHe4faFTqGkatKjwKTsMCSDnpEYG+LaM6KZCurC0plcyB4lgk8p8PT+APTNI+XUggxLeEGIh1K1vIJ3ZNJUrIB1PcuOZWGUK0kkgIgxk58SiTjbMy9KXyYOtQ/shcbU4YEqdlbcvmAvTv0pdzSjn2lu2QBOoliqt4SNBwRqJ6Df9WlXJCoy8zBVuEFYIacsScuZx/k+VLSnQ5eHtyVwBJMmYk0km98iQRNPl3g6sEhth7wW5rWQmhjJgzvmPIIueoNSy/LbZfZ3CJUg5LSNQWJ2/gPlZtpbFq77Wywutp9mTyjeSbaz+kIEA5IycZqlc5MqpIlrYU6srgj3QQ7EAY+8M7VG7pdWMeN6DY14z7gSYgQaEyYk1lYwvvknAUk+GNwANR6QZOa9Wx6LRuGe613mFuVtEGXk6TzAQpQGTggwJjeqq3bttnCELKNg8pIbLRIGMDsczKyDUuFNskm7fI1e8UBUrGo43Q7rIjKdTinJkiPr9FyMbutJJOlmC0fmJuaaBrsqSrhrSvJbUCBsVldKwIzmYxke8dxBr1fQXpu7wF1bvDuR7VEYowY255SwgtzAKfECTnEVi96MRrZuC4tsWnU2lZQQ+vQSS56KRnVP0IBTw7NxEurlVFt9ful9RBKKEySNLT2kd6gE3rHXXgrXtY8OY4N3rVzMVMXgTIIERBEkLf/ql6zW+Ota15XWNdsnKkj8VPQ/wMgfQ1zZ6J9Yb/BXLLKCWtnSQZRNDAQHHhjeIjOTJgjoP0P6RTiLNu9b8LrIncHYqezAgg+YNduFiFwrfqq81t+yDAfLPlPGYOki/A+BqCB6FFFFWrgXj+tPpVeF4W7eJ8K465OFMdQDk+QNc7X3DHLmZmPEWJOVP59Zrbf20cYo4azaO9y4SNx4Fjp/4grT5JBmM6Ox/H5Vm7W6cSNF7TsDB/D2U4n5j6Cg9d7zssIWaZIKjoT+yNhn4fSoQoMw22CSN/pkb1Zbh30oQzHJ06o+Y79O3wpXFoy4dYMDTt1J3+h+lUCVrYgbn4ddZKBfUNxIBAgbzGM77n60cLfe2wudQfeE52P8AP6VEHZWMaTydjnHNON96rvbyQ7JMnCOZE74/rbpTNVOKCaxzy1yrxvdejb9KMrahc5g5IxqJBwQNWBiNh0x0NIU22bLEpMmRIwv3Bt0EZnNZXnAtq0jmJnAxgdCWMR54Jiq4iGUjMjZ46nH3ev41MJXOdMSI1gxrE1m/nPEn0OF4W1dLhiUgjRg6RnKwucDt5nsKpOgBMTBLezGCwjLavOTVrguMtlCjg4BhvGSTOd9UL23PevPEqIELGzJJ36Pp+fwqKqO5eOOvL0zcbibCFau8dNnkQLAKsww7BR2Mcq52jbpSginlABZhqXWpJWSCNjgkREHpWEI2BmQNJK61GBjOe31pILLBwSpDEz32yPDEb/Cm4BI51QTW9ZMDWlwCKjTiVcu8bcKFQWQeB1PiVHOnSQ22qOkR86r8NxrW2BhpBGREhRk4JjbePry1uf1r+yu1em5wjexuR4W5rbdYnLJnqJA6CtVemfVLi+FuRetFFBnXgo0mAVYCAfI5zmKtdhFg71lnYG3jHdGAe8YpQE60tzuL1iGjz1svdYuhJO6hzjlKhoJKkLiDntgRVu1b0JygqZgkaQQBGWOZJ8UjeT8Kr8RaUmB7SSrKwwRBP6Ro3gY+kdqFuaiE1Bgw0xcwdRPNqkakAECZ6dTvV83WS7huYUk3NTaZzpcDTL5RpKbTBnzIhSYAJ2AiQ25kAnfdqhx+gnSg+OcA5yZncR07U48AxLW9YJZWZioJwuNJbr4lExj51XfhwNahJYLzSFOhubTBXI5V2/nvYCJmVRiYb9zdi97E8hepEb3CTAgxdtlG0KtxUdCcs7EMccwAPhKzMb571Wa77FRbtEay0yhlRA5gwySZzj7wg9KXb4nSSWt8x5UnMMwAbAnJB6Z+FRa4xVkAkFIKcuYwDESIfrRBzVZxGkEsMTzJExbMUHlHd7oYnFS6anlbYJZRamdzLNJ5YBkY7/PDW0BW0gD6hzk5YheY6YyoMkD4DqZp/CcGyki2bZItLqGqYjXBXaTEGZAwdqs+jGF6WAliYAKhTPvlmGJERqMRA7YWdLdR9+PgriAd3eHez8xvDSCO6ad0SKkmY8TfEafaQQOUsh5RAJOqZMA6YMdTnakcLwpVgF1BriiCR10ksg1YIwSHHmJr0/TvAkXfZpftO/KS6CVZtJ0kMuwHKnxVuleVe4pmlXVl9kQIzILEhwc4jT26b0ZR5/RQXNc7eIqflm0Qd4yCR8oiRyBorvBXiNVviCUYAsFUkgs2nTJBYbaoAgHEnaEXeIGs3EuM7ggaEUtAXSQ4cYmWjy1+VRukPDDS18QTqDqcHkSBhyNu/wCjqFt2XUiyF1wSitEglgV0rpxttsxHnRAPXX0TNLgIcZEjPmMoBOoqJEAgmFG0pa2rXn1AwpKvzwBbnTAiAH3PUxnek2hbQMIhzpI1nDLkksqiZmPgAcSa9jifRfEe20lndgimDoyDBUppwT+jyT93PSvM9I221FHHs7mpwQzJA0GAogiRqUyCMRFPJ8FzOAMOZ3nCIsZrkQTmbEzebEA428zA3F0ktBcW+WIU6ng5Ucx5ojJ7inejvSFzhxcBaNaspYrDAYggiSBM7Zx3iK7ObgMt+lIytzlULEYyZzkj9Y9qqoqgjUys0apBdpKggK4juQIxgdZmpFupSuEkFgpzAaDSsZZSJkGkxAXsWPTMKF9qSlxFV4UOQEZSupn1NBgGFjYTPTZH2H+nAfa8JJ0wLtoMZI6XFnrg2zsM661ffBvAsGBS2AEmFiRsAVgR4ZLQdJyYivZ+zv0gtv0jwjQQS7IeY59qSoJUk9XG0d6nCMOBHUqvbA7FwnNcRABIMRJbAoag+dosIaOlKKKK7l5daq+3FoPB/wDnf/HWqmb6dtuvwraf26W9X9k8van/APXWrDZMbQNqy9oj8Q9ZL3XZG8dhwwP936ndFW+Gdf0YuF4GYEkidtJOBPXvS7t3WzAAwerDUN+TtJ3qKECACrdyR0I2z/UnvWOIeSVCx2CiAY8OO351QtSYqeqajX+IlQvICQJ0jzjIx8t6wLMqo1jaVxPw6Uli0FY66pM9u1OtGJAkbg7ZEbfwp7LnJDjb38uNuoQlyE0wymRpzEnO0d/5Vi1ZhBI0mc4/D9WkuxXM50xJ6L91fP8AOnpKNvI316mQOIzDHOPrRVRImIJilqCeUmeUWrJuo25YlE0Y1RO37Pf/AF+FOtWhodwTIJmMj5yBGx2H4Uvh7ihV8RXVpOQfEdlMgj3fOkW3htJZ50w0ETAkZ+mf9RTCTKrcWANMfNxiCevKUx7TIQDiQDGYlm8U7eCPrG9ZKOhGkc4yMjQVjP8A6j5/zQ98TzCcwp053jtj84ppsvhsadJ0kFNkwYA8X7PNM0xGRVAdMboqItl0bHkTenWApV+yrqVdQynBDAEH4g00VmtReEWt/Wb7LbF1nu8K3sLrKRGdE7zI5lPnkDtWqvS3qnxvC3D7a0zYZTdEOrag0QxzqnMEj4DaunaTesK4IYAg4IIn6zvVL8FpFKdaLT2ftPFwy0YneaDMG/nB9QaUELlhuMYhQ7EspOo6eYg5bTEYY9+m+RSrUgaQpLwJKxMQRJYiSSY2nfeN93etP2ZWL0vw4WzdnV4AUOD4lGR8j8q1d6d9VOJ4WWvox8I/Rq72mMjmkHG8Q0E9q5H4bmyTbrqTC3dm23B2gtaw96gigNtSTOUATy0+abimOVLTA1yO0RkR2H4mmXHJtzzhjDySZ+MjdWXSN8Uy8zCGUEAnOmTvqgkuAVE7eGJ8qYly6LTC2x021TUr6TmPDKDHXBOxE9qCbGEwaYeC6TBHCLmK0sbWIm8RS4d0OnSz6o/SS/IqahEHfA3+cVf4Ow1xNJf9HpVtJ06jJ1ZgEnY/GPqjglHtdXI2CdSFhBYYA1GYKtsRnMVZCr7T9NaABMCGAgpgHSviaZEjv0kUOvA6/dGEd1m8/lmARRpmBEVANxM1ok8LeJIYOQFKzq5X1bfoyASytoIJaJ+tOvWjeJ1FU1uS6qdABITSCCJNzxGe65ot2hcIA1KyA85Kkn3VLkYPfHR+5mlW7ulnDSHxjQSTIAI0x1iZIAzHSlB/L191c4CP80UcfOn/AKBMERWoInIVV4gc6rgFtUN4sTAPveLb9rfFQu3m7s3NyKGZckjdYnOwg4rN7g5YuxD5AMOOYgTKzErA27ggbRTLnANqU3CtuTuZjJCN2LbjyzvTjdv191yv+IHdIsTXhJv/AGAXgQQCMrr6ThfSNrVca7d4i5cW2UQiZM6VAuOwPKsiO3MOs149kh/EraVublFLGQA0E8ol8EZ1T0xTuAuAOQFssoUZZZLuDuRMtnmJ6Y2xXncTeLhiFYkMZGkFUUjnaAdQOoHqQMiZzSRJXY1+5Wb2AOg+WtqQ4Uk070Si7Y1sSWVSIOhsc84C7/hjw07iuFnUWcMykKQUXM+Eaohth/vVTWz+zkABcGG1EzMSGHLPby7gCnqzaNKBgo0mMeLJ147AJH47ZYyI6/hc7IxJkXjN1YANRQGJi0Zgd4JnGXSyIiB9YUgqS0lVPvL5bTv+AHs+qaKnHcIdP/bWeWFGTcUap7+9Gf8A3V4Nkkv7PX7Ms8sxLSx0zPKCeaYA8xXseqDleM4dWED+0WOUuVM+2WHVeoYHPwioDTIE9SEz8UFrzBNCJixAJykzNTMAHKKrp2iiitJeMWqftweDwWPeu/8Ax1rB22GwOZjbOfp/MVtL7cTjhf8Azf8A461OSYAHNWVtA/zT4ewXveyHEbBhjg79blm8saichxjbV8azqIGC+mNQzsP4zTL7DciG2JA38zNJvSVOEC98bZx/XaqQtF8Ca9cf3z1WTLE6QSy+Ulo6r1/WNLt3eYvnm/o48Px+FSWYLgwUgKIzp7zt/tQmGMtLjEHOMjl86ngqzJdP2418pjzzULt6GYb9syBq2jzB/wD5otsyEAGDqOGiOY/19KzwhUNoEDbJwNW33v8AMBVe8AGhC8y2W776hp/CnAyXO4wA+azaYitvbIRFqr07QUuGdWJ6EQM+Z8RXtHx+NNLTaHbddwBLKMr4VXMbDftUb3EXWMNj3pGNX3f1e9SS2ZbUYcqCANOlhGInvzdt6BIQd100M1uBcixzyAAkCbE5qS3pXULgMmD3AC+LmH/LTtOnC+zxElFlX1EwnYGBluhaqauoJFySYgb6l3EDtqU5/lXq3LBtrbZLntA1wM4HSSCNLGZntuI86Z1AqcF7S4btprEmPCZFiTegI1XUgrNYFZrVXgwiiiihCKTe4dWBBG+/n8R1p1FCFr71n+zi1fVjYc8OzbhQGtHbBQ5QQPcKjyNai9ZfUvjeGLPetlreG9pbYFZGxmBp8hg9c109Ve7w4IPn06H4iq3YQNqLtwdte2mJ3m6E+s11Nwb6rku3xLIVyq7CS0QmyM2nMjlOe+2an6RQuxxpQQ2wk4jUsnU4eOnb5nefrJ9l/CXjrtD+z3N+QD2Z+NvYf5Y+BrVfrF6ocXwRU3bRKJj21rnQAKdw3h8gwFc5w3NMwtbD2zCx8MsLjJIoZnlIgEHSkxJNo8i2FRrTKxJ0SZBMeHTHiboBqT6020huhrptqCwKBDrAcMRLat2YYBJGY6Ui7bHs0cIzKVK7iSYJnlMhR9M/Cm+jGRADcFwgo62yCsqxgNqVm5QdUHqZETua4z65fddrnwQ2O7oByANRu2J3by41BCXw18CU0e6wJSNRkrtOdQEfh5Uw3WZ2mbenCkKM6oCpDE6ZHMfkaRxjL7OA/vjJG28frDpHXeixfc3ZTnALGDzDVDSPgRjH3lzSwKlW4T3N3cMVAItFsgNALzQk8QVC5YCFUuaQweZQjUJ0wGAWffHhwQKsm46nxNClhhpBMltK6QCVaCsnqR5Vi/etqZCqpJ1aQF9nicCciG5oBHTFI4l2Ps2ZACDOAAzshORjIBMR5eYgFTVBcGglrqyBSoikAxQyYImDe8iWDH6VEGnIblBKzOrWNgpP3p2+FR9HNpUIQebJloWSvL4sKdoI7eUUMlwKGW5LXNYchdMaJJRp/Z/5etYQKyRq1E6TdkEvynUZBIOn9aetQYiJ66kceCGb4d+LGVju1pNLiSN2Y3t0GKgAJKXPaKEguWzJInwwQdXLp8Lb4b449/1G4h/7fwq6wR7WzlvF40HLntymvK9HsjIyEhV0NsBq0j7u8lpjr4W+8KuepDf/AHLhvZEhfb2PF4oZkwdODv1nYU47xIVLpwmNcHTIih/2mwmsVqTpAbVdTUUUVoLyC1V9uQH/AESe93t/+LvWs7trTEGMT0MZP1/1rZ/21RPBkiQGuyNjkW9q1dPMIUaZ2mMfHpj+NZO0f/U+HsF7/sf/AEGGf+X63Jb5I5gZPuDY/tU227oobSNDQJI3jcb/ACpcgEgqYJ+MdKfduEIqaiygSpnYnf5/nVS0CJz9+vpyVReZidGkMfD/ADkcs/zqVi+6SUMQZBgbxHX4mncRxDOotkgqpMLuB3OPM9ar+zC9WIxkc3NH+313FSFU9ptzrbz04qHDoSpOGiH+P5028ZJ1pDN5afENP7XagXWBUECDpOw1EfeInGOhjYfs1i8gL5cEiGkSfgJjt/Op4pPlEaUy8L/XwKVwgt/9o6ghdIG0Y8bHqd6OHYqwnbxaZAHlqb60wwWIBuY30KNOnPX/AIazat2ihGdRP3hu43x/DNSClxMIyLTWutrxOQrlwOSWnQ06QTc25pj3TJ+mzTmgcOQNSFQdeAiYAYAatXh0z9cVADTl1Dg4yNXKu+jtv89/KrfEXnhpBGoq0DChQYAjOT+B+E0xKrZBi4iLUi5ypmCCJk8IXUwrNYFZrWXz4IooooQiiiihCKK8j0x6fscKpa9dVYBbTI1EDchd489h1Nas9aPtXvvKcLbNhDtdcBrhHcKeVR0nm+VI/Ea266MDZcTGEtFNcuus1tT0z6c4fhl1X7qpOwPiPwAyR57DrWqvWj7UnbUvBp7NNWn2lxSzEnOF2AjV1aY6V8MGuXUu8TfuFnQgMSwDMsqpZiIZskA9sd6pm8dXMGAm42gGXg9dZxqltvP9auV2O82668lu7P2XgNAL+8aXFptI0zIkkiCABJTr4LKrv+jVpAJgFwNLKR1J8h2G9Ru3La6CluSE1OHkAqw0LMycFj5bdpqPDmSHuEgKVt8wLEA6RhRt9JyPhWHsWwVhRBnSSIwxwSAY6YgRtVQgLQJs4iLV5ZjQSCQIExEyaSPBKb3syp1EcqlkGYkLJOFg7AGPMVY4i17K46i4oQEwRpOoZn9kYB85qfALbUOLqe0LKIgiAyuOZgQdSkN+KxtVbhnPPrtjSUMaW0hTI0nrqjV+PSMCKAbwlpOh40k8qVArSKVRo5yVIaMB0QhSGYDOY0qXG3bymvRv8TesKLPEWVAKs0MoB550kPJ04JxuCTVSwEfTauBkyB7QkkzPUkMVGY+X0u+keNa5d/SubjIIFxrhkqiyJBwB1+Z7RUTCYMc4gAgCc94mTzFTlUw6MzVeVYtcsXFITSWB5uQnpnDDc8vlOaz/AG2+tnRJVWC22AA5gASM77t0j55q36Q41+KuK15wx02jrYglVBwgKgKrGT233pFmzsNVxSG/RzzAgtgnYAk77bzJqQbkKHYRMNcIMRSgPCsCgNOJig+WXB6gFuIqsVLJAWYJ35QBDRP9GvS9WwP7ZwnKUb+0WJ8wt5J8O+D7361U+FvvrNshEKyCcLpYkBQzA/DIk+Q3q96lWl/+o8M2sGL1pYg5PtVyGIznH4/GB808R91DzvYJbqHCp0G7c3NqTM2mAR0zRRRWmvFLVX23gzwm+93pPS3WsOKgKp1Sx3WIj8ya2l9t4xwmYGq5J/d1q8sCQFM5gTjEQP51lbRXFPh7Be+7H/0GEOf63KFwYAByxCfCPhvUWXPVh7sn5/n9KiLRzBGodPhiQYz/AK0KYJn6SM/OqYhaLnSbddGY5KRQkEsd4xjr1EeVRV8RO+38/wCA+XwplpoUalnsfnM95MGq/tNbAlcfsddtzUqulJ6m5VjVh5IjI5onHvahqOCKquxkEMOXr8ojb+s1aXU5MkA7ZO3STjbH40kcoMEfEd2kRkdoPTemCTEBNpH7Vn3PBZ0TEnIGQOqnP+vz8qRqUk6A/hPgEQfOfOsnKtzFes5/j7uKvC2NEhnlljQz5OdyOkbfPag0SNYH/Ll0J0tUZ5CipX1FuANRhV1SCIJ3Mjz7TtS1bSQGTUNIPL0ByzEDsZptsXdUjPnynYfq/h/Wq57YQ5uBg0chUBgd8MIAA32+tSTSFV+GAd8A8oy8aZzzrmuoRWawKzWuvn4RRXienvWThuEUm9cgxOheZz/lGw8zA861h6z/AGo3roNvhlawGfSHwzsI8SmYUbZG0jNVPxmNoTVd2zdnbRtA3mtgam3hmfALZ/p/1m4bg11X7oU9EGXM7Qoz03MDzrV/pr7VL/EXRa4RRZtsQNTEe1bIxJ5bYIkEiSNwcV8Bxl/USz3Gusd3zqLFesAyf1T+VUdKLOWMYBKnYgEE/cAP8qo/Hc61FqjsvCwY3u8ZzpyEVv4jWDQ/R+mrJe/cb2im5IBLBm06gYY3mMGJOSf514XF8MTNvWjFLZOoGdt4bc7Z7ctZFx2RnIQagukuTqJEgsFIPMumJxEg5k0yxxjFS2ByqvhkmY30zkzOK5zIqFrscHw101GmVa3zERe9CaKzZS0bbsQqxAJ9mFllGnQsDB1Tv/rVZOHt8ulpDat+bAU4OOZpxmImlLdlWR4ZVYGC+841tG5gE58vKncWh5QF0nVKafdjYAHEZ5onJ+FBmxTQHDfaB4A3mumeueix6Rsqlm2fZEXQ8NcBAWILZgkloEyenaqi8Z4SwYoJxrVySqzOpsx10+eO1OUqeQnmwwZ2ZgJ8cdCWiPr2pV0szZMe6JEgicSo3OcTvt1pxUQVzGcN5dhmBIFAMjnMU4WiJtSxaJ1SgcqWWG9mQrc8NBPWe++Kf6St204gWrdxrolZcLoOogeBXXlVSIzzfWpWLaArrusqICQdOoFgQcBYAXUZjTBODJpLTcDaNB5FdgzwSUPMFx8vie0Gloaq2S0houDOs50iTWrRM0md4lYZAzga2Cez9oTkPzsYj9mR8YpdpbkzBLyBJIkSSpHNyMYBM/XvS7fCkgXAdUyDLFGAG8cuBJ6NmTQh5CBJYkkyQNJLHmhBLahvmBQBCR+MH1iKTe+VDEHQEU+Z0i4m1sBFLMTMiMAgriCBq/WgHqT5VYF3VHMZUE7bAAxE4CgbY/hTLnGezQFrQS4DqO34RPKCDucfKqXCXmDM+khoZklYOPMhp+VRUhWw1robe1rAWzm8UNiIVq7c/R2wWUGVYEwpTYRCg6upMkRHSn+pjMfSHCnUOe/ZBj3gLiGdsTPhH61VVsM6MTcQEmcmQSAE04BYsWyI6bxXpeqlxl4vgwDg8TZUafCyi4IMfrfHoPhUtNVXtLZY51QIPseNZkC+ZbZdNUUUVprxK1l9tfClrfDXOitcX/iCkf8AoNajVj5fH+v6zXQH2i+ijxPAXVUS1v8ASL8UyYjqULD51oK0R1yY6CT8prM2psYk6r2vYONv7Ju/lJ9a/U+qYyDUCRiPMRn/AFrDwTjtj+j5ionVk5GIIHbtWcnqAq7SNMH+j+Fcy3JvAz0WXjTGormGB6Drn8qR7MkMZVRjpo+BNSzJEzv17/xrK/LH9Z+lTZQ4TTw/jKnD6rAc/wCUk/c6YwDsZipMOUzH8M6SO2+30pjOIkxM+UfIGkKpYjIBiJ0RmBAqeKQjdoDXwv4+ylevFFa2CMsS0bkgjm7zI79KrOToZzzSd4/U79sj8aYbgkEyVjm+Xby/1otlcYQjqWczA/EwINPYLlgOff8AYxfOeM5ysnh+Xcu2SwJwsH3Se+PrTbfEswCF4VQTDKcHlhQp5ujVi7cTdQA8QIWQ3Mo1EjptvH4VBZA06PC0OU3x4d/1egn4DeouKppDX92/nTSRW1eVoEBdF+sHrbwnBj9PdAboinU57Y92e7QPOtV+sP2m8TxJNvhZ4ZO4E3mGogwThcQYGZ718hZ4jxLJaWLwdQzEnmnbfmOZHeKppb13CcgHqNREdF3zj+E10P2hzpyWNs3ZODghrjDzxt5aaE6zzLt9tTCXY6idTAlyW6k41f61ni7ilE1ahycwWQAx+JnfxGenXNYPCHMKQMkEkZ7mJ6jT9W+FRMaVWBqLNI1S0r72fDn6Z3qoRcLScXguBpTOdYA9hytKEZdMypfRqKspM6jnT5Z8XnSbhtkFl5TMc106we5E57zqmrNrV49hpYEYOrmhgGIxlR9axwqJdKqNKyX8Y9oNOYKjyiM7T8KkGFW5rXUEGRTjOY46/KT5FS4IG54xCBs+zmYEDB2jGqD93anAWwcyNTcu/UhIHWcz1qFzRZcJknUhBt3GU5BUhVO56TjH4ru2ELQADJGktlVVRnUR7o8z0O00pGSsZk4DeOp/gRkBxKYthmV4A0KzEspCHUZHMJBG4BBxnyxK7xRuNhSVJGiF0gAeEADd5juMf5ab6V9FvZCrdVLRZWYqEy6+INzQMsNjGxHcUjiLsNrsl7VtQJhzIdiwbIyR4h4us9YqQKJXvIJMSOevpA1NZrNAk3uGKpBDLq51DNE+cgnpnOT1FH9oVW6MBbCwZ5tuYH3Mgb/dEdKtuUa0ryrXRqCo/MroSQQBupWFMCcButeabUtIXMFmKklFIA1Gdx4tXiAz0qQEmI5wIgaC00gRqDcmMokwJBHuFjcbUVaNRYyvaU+RgY2xtvTOCuksqsEPTRnJgwBplhkzHx260zZAIgj8T8kjxdRjvXpcO4Kn2ay2pchB2hldiZCwHI8wKYgZKjDcZG9SONzNaTXjWdSRRMsLbV7pcMIcwf0oMQDHL+3tvgTJzUAsk9w/NnOYJM6pERHy231Qt23AbUzlCxaPEAxmSNy2fLNTe3caWNxQSIU+BmXmJEy3LJHXoPI0jtSV2YZFgzM0iDxNdaAH/reiZxeg6ZcssBgpTBecCCJ2746461TaKorl1EFjpIPUNyqvxMDoKypYyJOgZkn3QB06AjVjfHzpvDXIOpSnSTAjGN48XLg/gKgmBRO0HEIqa8TelRWSKZG3JYUvyh5wFYf9WcHPT3crEV73qbw5ucfwa8uLiMIMYtszmBGRChd/OO3jtcUaSsap66WIg/HlxH5Yr7v7F/RRucQ/EsOW2gCiI5nGmT0nSHkDbV9XwxvPEarm2zFbgbM6swCI5ik24CzTeJC3XRRRWmvDorQP2i+r54PiNSL+huEsh6LJ5l+R2+I8639Xl+mvQ9virTWrokHIPVWGzKehE/iRsapx8L8RvHLritLsztB2x429/aaO+hHEXHiLlc2oZGD/ABio6owfiZ3/ANq931k9WL3BXSl0cpkpcA5GHx6N3nb4RPjs+/UgjOWj5VkkEGCF7/De3Eww9jpBscj1p4FKuLuJ2PfyzTTaxBADdRqIxGP40q2kydOqdWdt9qsHiyUa0J0lsgRJI7Htt9KlKBXe9P3ISVsCJkFT2g5OP6+NLdskr2077f8Au2mrPHvaJGhQuMy06TufgPLz+VVGUCY16vgIyM7f1mmBVTmGJgU6j3p9k1VVZkHUQIJiMiYk77waRw7ifF4fhq/H5b1MHOo597J6ftU32gxCLL6WZWXoOm2QJFSSErWkwRTqmd5HUVQrGAYO0DXyY/pwv17U4WwdBUd5041CSzERgbgfhSuLvYgABd40g77/ACzt50+2i+zAkhtIZtJgRsAcbzHlRko3u9Ay49ev0S2dQfaDlbUIEIBuNRtjvIGonv8A5aSvFHW51OZkgz7wncbd5xTFuOAoLERyoYGn4N16CoBOYKXPhkdZIIyR+famEZqp4cSC2mdaV/e45ShEzAUEF5lyccu2Tg41fNajfvGQCAS1tSQigKeuYAk6QInttkVO5EkwWIiD0ABysfCTvioMsYdcjmJ1ZjqO7DB6xQOCV9QWuEVvFK0igIBvBNvFS429r5iHVtKqVOkSPJZ2yP4VG3ZAZFM+AbbFTvJGR0Hf65lesHSecETgNmPjjbT+PWlDxjQRJ2KjCr94zy/5c4HwoyQ4kvBOo010oJmlIyNrW79pFRJuSwUhbYElSDqtmRkg/HtSGsmN0yJkucwAdj4+8/jT/R7Kzxd1Kv3iQASnKRPaf4fOqPFWOVoGOw7k4XHxjPf6yBWErzujeAkCeFK60gfXy9DijefTrZmuEgA4d1gEQAZDoRgA6RUeBuCWEsGOgZEggwpnZdcj5nV3q96Btsl5WR1tOgP6XxDCyASRAPSPLzqq1wuLl3dsmNoyC2r3pmdveDYpcoU2c2TEZSdKzlPEVJIbG7CXdkjSilTzBpGhtIgRPbIblB0iq1pyrkJmRAj/AC+72jpB6VHXcYyrvjE/tH+farI1q1wjxaI1BPvQAqfcPnnenoBBhJH4rw4b1D6QZgya0M5UyNEu8zIWhtbNykaIxOApBiZPy+lVr/EaTEFemk91jC6fh97tTl2AaWCsDqQkQGUa4wTGk41RphdqHCAnQWKFcaxsD4h+tB+Ric0QEhc8AQSPWnCZJk5hxAB4kBlxCeVWOmVUCHVtPWARzfHG5rCkF/ZsPe0iABHV5J2JXB7kfCm8OqgTq0x5ARjOnT4e2386Tcu8oP3gyF8vq5o8T6dmiI86TgumgAdPEjXzOppJIpNf7o20Y+zKczHCgHxH3cdxGxxyzttZvWUYCNGmPvkAE5bcRnAg47Gl2LMLOmMCDtgKZx8evnkTv6lj0geJfh7bWzdVTpW2oAJVj1gEkkAR8DUkqpjSzQzlbykVqBMUoDJMlVOF9HEsiKvtHYr7NV3MTAYrmdR/HOrNdCepnoBeC4VLIy5l7jfedvF8QMKPJRXjepPqRa4VzxLWwL7EwJ1ezVuhYjmeJBbzIHUn7iu7Aw47xXmO1NtbjEYTLNudT9hYZXIoiiiiuhZKKKKKEKn6Q4G3fQ27qK6ncMJ+Y7HzGRWsvWH7LWEtwL4g/onMf8LbHtzR8TW2aKrxMJuJ8y7Nk2/H2UzhO8MvL7QVzRx/ojiuFJF6w4mRLIdJn9YyD8aTw18QUCA6jPglh0MGumyJwa8656C4VjqbhrBPc2kn6xNcrtj0PXXBbmF/iNoHfw/I/Q/Ulc1cTbKkyD0qbXCdOCAI6f8Aqz4e1dH/AN2uC/wlj9yn5Uf3c4P/AAlj90n5UvwjtQrR/iHAkncd5hc2X1yQQXPw/wCbG1JdSMwTjqJ6f7fUV0z/AHc4P/CWP3SflUV9WOCH/dLH7pPyphsrhmEmJ2/guM7jvMdFc38SrQTnIhhEeY+IidqzZuEAqoDBgC3LkEH3SPlnz2rpJvV3gzvwtj90n5Vn+73Cf4Wx+5t/lUfCv1CHdvbOXTuO9PHNczkBiojY8xUfDrPz+tO1mCADpBzgz92N+/ujfyrpD+7fB/4Sx+5T8qg/qxwRyeEsfuk/Kp+Fdql/r2EAYYfTrjxXOljjQAeQkwQsjbeTgQcDrH8aq2CCFJMuonQymNO0zG+o10p/dXgf8JY/dJ+VSX1Y4If90sfuk/Kp+FMXSjt9hdLmHzHD7Lmp7QEcvKc8w7iI7z738OwOGtHaEIMCSY7CV+G9dJ/3V4H/AAlj90n5VJvVfgj/AN0sfuk/Ko+FdmUf1/DmQw+Yz8I9FzhYtW+sXCZUIqx8XnqCf40ogezEC5LmA7TpVhAaInO41eXlXSdv1Z4JTI4SwD/4SflWH9VuBODwnD/uk/KpOyum6gdu4QZ8hnn1x5Ug0lc4cFdKKy3Pfk6d9RgRjrPn5T5Um9oSEGozp5RhT10/dOmD+NdPD1Y4KAP7Hw8DYeyTH4Uv+6PAf4Ph/wByn5UDZTMyFDu3WFgYGGOdYz5+XhFFzjwxL8qofEGI2CaTzDl3JgLPnNY9kXLMQdP3YMSMqOxGevLj/h6Q/ulwH+D4f9yn5Uf3S4CZ/sfDz/4KflR8K7X3TDt7DzwyazceGWVfOMhHOtt7b2zIGp5IKwNWBCsd4GcUu/aItqZM3NJUDPs1EYY9Scx5HBro4eqnA/4Ph/3KflTbXq5wa+HhLA/8pPyo+GcLEIHbmCaOa4ciPrrXPQ1Ilc1+zFxQF052VoA0zOlTG3L27e7UOGFy63srYYlmMBQWHhAhSM9+359K/wB2eC/wnD/OzbP8RXocNwyWxFtFQdlUKPoKkbKcyq8Tt1pHdYZN6xPlUDgKLR/qz9n3HXRpvWksWzBLXPHt0Uc4I2iVFbX9XPVaxwaIEUF1XT7VlXWR1yBgf6TNfQ0VezCayuayto2/GxxukgDQADzNz4ooooq1cSKKKKEIooooQiiiihCKKKKEIooooQiiiihCKKKKEIooooQiiiihCKKKKEIooooQiiiihCKKKKEIooooQiiiihCKKKKEIooooQiiiihCKKKKEIooooQiiiihCKKKKEIooooQiiiihCKKKKEIooooQiiiihCKKKKEIooooQiiiihCKKKKEIooooQiiiihCKKKKEIooooQv//Z",
                "Youtube","Machine Learning Week","Machine learning is an application of artificial intelligence (AI) that provides systems the ability to automatically learn and improve from experience without being explicitly programmed. Machine learning focuses on the development of computer programs that can access data and use it to learn for themselves.",
                "https://miro.medium.com/max/1200/1*xsir-fypCq_LrbK5jjyN9w.jpeg","Youtube","5 Jan 2022"));
*/
        CustomAdapter customAdapter = new CustomAdapter(news,MainActivity.this);

        binding.recycleview.setAdapter(customAdapter);

    }

}