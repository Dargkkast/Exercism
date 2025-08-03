public class Blackjack {
    public int parseCard(String card) {
        return (
            switch (card) {
                case "ace" -> 11;
                case "king", "queen", "jack", "ten" -> 10;
                case "nine" -> 9;
                case "eight" -> 8;
                case "seven" -> 7;
                case "six" -> 6;
                case "five" -> 5;
                case "four" -> 4;
                case "three" -> 3;
                case "two" -> 2;
                default -> 0;
            }
        );
    }
    
    public boolean isBlackjack(String card1, String card2) {
        return parseCard(card1) + parseCard(card2) == 21;
    }

    public String largeHand(boolean isBlackjack, int dealerScore) {
        if (isBlackjack) {
            return dealerScore < 10? "W" : "S";
        }
        return "P";
    }

    public String smallHand(int handScore, int dealerScore) {
        return handScore > 11 && (dealerScore < 7 || handScore > 16)? "S" : "H";
    }

    public String firstTurn(String card1, String card2, String dealerCard) {
        int handScore = parseCard(card1) + parseCard(card2);
        int dealerScore = parseCard(dealerCard);

        if (handScore > 20) {
            return largeHand(isBlackjack(card1, card2), dealerScore);
        } else {
            return smallHand(handScore, dealerScore);
        }
    }
}