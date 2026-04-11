package collection.compare.test;

public class CardGameMain {

    public static void main(String[] args) {
        Deck deck = new Deck();
        Player player1 = new Player("플레이어1");
        Player player2 = new Player("플레이어2");

        for (int i = 0 ; i < 5 ; i++) {
            player1.drawCard(deck);
            player2.drawCard(deck);
        }

        player1.showHand();
        player2.showHand();

        // 변수를 선언하고 나중에 뒤에서 값을 결정하는 방식은 비추
        // 값에 대한 결정을 변수를 선언하는 시점에
        Player winner = getWinner(player1, player2);

        // 아래 로직을 메서드로 추출해서 리팩토링
        /*
            int sum1 = player1.rankSum();
            int sum2 = player2.rankSum();

            if (sum1 > sum2) {
                winner = player1;
            } else if (sum1 == sum2) {
                winner = null;
            } else {
                winner = player2;
            }
        */

        if (winner != null) {
            System.out.println(winner.getName() + " 승리");
        } else {
            System.out.println("무승부");
        }
    }

    private static Player getWinner(Player player1, Player player2) {
        // 방법 1
        /*
            Player winner;

            int sum1 = player1.rankSum();
            int sum2 = player2.rankSum();

            if (sum1 > sum2) {
                winner = player1;
            } else if (sum1 == sum2) {
                winner = null;
            } else {
                winner = player2;
            }

            return winner;
        */

        // 방법2
        int sum1 = player1.rankSum();
        int sum2 = player2.rankSum();

        if (sum1 > sum2) {
           return player1;
        } else if (sum1 == sum2) {
            return null;
        } else {
            return player2;
        }
    }
}
