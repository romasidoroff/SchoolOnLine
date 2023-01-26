import com.academy.models.Lectures;
import com.academy.servise.MainService;

import static com.academy.models.Lectures.createLectures;


public class Main {



    public static void main(String[] args) {


        Lectures lectures = createLectures(1, 1, "name");
        Lectures lecturesSecond = createLectures(2, 1,"name");
        Lectures lecturesThird = createLectures(3, 1,"name");
        Lectures lecturesForth = createLectures(4, 1,"name");
        Lectures lecturesFifth = createLectures(5, 1,"name");
        Lectures lecturesSix = createLectures(6, 1,"name");


        MainService.choose();
    }
}











