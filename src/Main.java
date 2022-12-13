import com.academy.models.Courses;
import com.academy.models.Lectures;
import com.academy.servise.LecturesService;

public class Main {
    public static void main(String[] args) {
        //Lectures firstLectures = new Lectures();
        //Lectures secondLectures = new Lectures();
        //Lectures thirdLectures = new Lectures();
        //Lectures fourthLectures = new Lectures();
        //Lectures fifthLectures = new Lectures();


        //System.out.println(Lectures.counter);
        //}

        Courses courses = new Courses(1);
        Lectures lectures = Lectures.createLectures(1, 1);
        Lectures lecturesSecond = Lectures.createLectures(2,1);
        Lectures lecturesThird = Lectures.createLectures(3, 1);
        Lectures lecturesForth = Lectures.createLectures(4, 1);
        Lectures lecturesFifth = Lectures.createLectures(5, 1);
        Lectures lecturesSix = Lectures.createLectures(6, 1);
        long countCreatedLectures = lectures.getID();
        System.out.println(lecturesSix.coursesID);
        System.out.println(countCreatedLectures);
    }
}