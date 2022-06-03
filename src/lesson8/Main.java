package lesson8;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.setName("Дарья");
        user.setLocation("Россия");
        user.setRegistrationDate(new Date());

        Tovar tovar = new Tovar();
        tovar.setArticle("49627053");
        tovar.setFullPrice(6690);
        tovar.setSalePrice(4683);
        tovar.setFullName("Gorenje / Чайник электрический K17CLIN");
        tovar.setStatus(2);

        Otziv otziv = new Otziv();
        otziv.setUser(user);
        otziv.setDate(new Date());
        otziv.setReit(5);
        otziv.setDescription("Чайник очень красивый! Просто потрясающий!!! Да, на крышке скапливается конденсат и капает несколько капель, если наливаешь из чайника сразу после закипания. Если подождать пару минут, то конденсат, видимо, стекает сам собой внутри чайника и уже не капает. Для меня это не проблема - стелю кухонное полотенце, " +
                "иногда капает на него во время наполнения кружки, иногда нет. Согласна с предыдущими отзывами, что кухня играет новыми красками с этим чайником \uD83D\uDE0D\uD83D\uDE0D\uD83D\uDE0D\uD83D\uDE0D");
        otziv.setLike(1);

        tovar.addOtziv(otziv);

    }
}
