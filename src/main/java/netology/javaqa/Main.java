package netology.javaqa;
public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Максим";
        post.passport = "1488 № 934722";
        post.patronymic = "Юрьевич";
        post.phone = "+7 (919)-437-83-38";
        post.surname = "Сидоров";
        post.subscription = true;
        post.birthday = new FormDate();
        post.birthday.day = 17;
        post.birthday.month = 12;
        post.birthday.year = 1986;
    }
}
