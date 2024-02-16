package class0.ex;

import java.util.Scanner;
/*
    MovieReview 클래스를 만들어주세요

    필드에
    영화제목 title
    리뷰내용 review

    MovieReview 배열에 2가지의 리뷰 정보를 넣어
    main 메서드에서 영화 리뷰 정보를
    선언, 초기화하고 출력해보세요
     */
public class MovieReview {


    String title;
    String review;


    public static void main(String[] args) {
        MovieReview[] movieReviews = new MovieReview[2];

        MovieReview movie1 = new MovieReview();
        movie1.title = "기생충";
        movie1.review = "너무 재밌어요";

        MovieReview movie2 = new MovieReview();
        movie2.title = "부산행";
        movie2.review = "무서워요";

        movieReviews[0] = movie1;
        movieReviews[1] = movie2;

        for (int i = 0; i < movieReviews.length; i++) {
            System.out.println(movieReviews[i].title + "은 " + movieReviews[i].review);
        }


    }
}

