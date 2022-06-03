package blackJack;

import java.util.concurrent.ThreadLocalRandom;

public class Koloda {
    private Card[] cards = new Card[52];

    public Koloda() {
        cards[0] = new Card("������ �����", 2);
        cards[1] = new Card("������ �����", 2);
        cards[2] = new Card("������ ����", 2);
        cards[51] = new Card("������ �����", 2);

        cards[3] = new Card("������ �����", 3);
        cards[4] = new Card("������ �����", 3);
        cards[5] = new Card("������ ����", 3);
        cards[6] = new Card("������ �����", 3);

        cards[7] = new Card("�������� �����", 4);
        cards[8] = new Card("�������� �����", 4);
        cards[9] = new Card("�������� ����", 4);
        cards[10] = new Card("�������� �����", 4);

        cards[11] = new Card("������� �����", 5);
        cards[12] = new Card("������� �����", 5);
        cards[13] = new Card("������� ����", 5);
        cards[14] = new Card("������� �����", 5);

        cards[15] = new Card("�������� �����", 6);
        cards[16] = new Card("�������� �����", 6);
        cards[17] = new Card("�������� ����", 6);
        cards[18] = new Card("�������� �����", 6);

        cards[19] = new Card("������� �����", 7);
        cards[20] = new Card("������� �����", 7);
        cards[21] = new Card("������� ����", 7);
        cards[22] = new Card("������� �����", 7);

        cards[23] = new Card("��������� �����", 8);
        cards[24] = new Card("��������� �����", 8);
        cards[25] = new Card("��������� ����", 8);
        cards[26] = new Card("��������� �����", 8);

        cards[27] = new Card("������� �����", 9);
        cards[28] = new Card("������� �����", 9);
        cards[29] = new Card("������� ����", 9);
        cards[30] = new Card("������� �����", 9);

        cards[31] = new Card("������� �����", 10);
        cards[32] = new Card("������� �����", 10);
        cards[33] = new Card("������� ����", 10);
        cards[34] = new Card("������� �����", 10);

        cards[35] = new Card("����� �����", 10);
        cards[36] = new Card("����� �����", 10);
        cards[37] = new Card("����� ����", 10);
        cards[38] = new Card("����� �����", 10);

        cards[39] = new Card("���� �����", 10);
        cards[40] = new Card("���� �����", 10);
        cards[41] = new Card("���� ����", 10);
        cards[42] = new Card("���� �����", 10);

        cards[43] = new Card("������ �����", 10);
        cards[44] = new Card("������ �����", 10);
        cards[45] = new Card("������ ����", 10);
        cards[46] = new Card("������ �����", 10);

        cards[47] = new Card("��� �����", 11);
        cards[48] = new Card("��� �����", 11);
        cards[49] = new Card("��� ����", 11);
        cards[50] = new Card("��� �����", 11);


    }

    public Card getRandomCard() {
        int index = ThreadLocalRandom.current().nextInt(0, 52);
        return cards[index];
    }
}
