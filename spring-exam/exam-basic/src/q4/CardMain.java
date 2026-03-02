package q4;

/**
 * Q4. 52枚のカードの絵柄とランクを表示しなさい。
 * その際、q4パッケージ内の他のクラスを利用すること。
 *
 * 表示結果は以下のようになります。
 * 
 * <pre>
 * スペードのA
 * スペードの2
 * ...
 * スペードの10
 * スペードのJ
 * スペードのQ
 * スペードのK
 * ハートのA
 * ハートの2
 * ...
 * ハートの10
 * ハートのJ
 * ハートのQ
 * ハートのK
 * クラブのA
 * クラブの2
 * ...
 * クラブのK
 * ダイヤのA
 * ...
 * ダイヤのK
 * </pre>
 *
 * @author y.morinaga
 */
public class CardMain {

    public static void main(String[] args) {
        Deck deck = new Deck();
        int deckSize = deck.getCards().size();
        for (int i = 0; i < deckSize; i++) {
            System.out.print(deck.getCards().get(i).getSuit().getText() + "の");
            System.out.println(deck.getCards().get(i).getRank().getText());
        }
    }

}
