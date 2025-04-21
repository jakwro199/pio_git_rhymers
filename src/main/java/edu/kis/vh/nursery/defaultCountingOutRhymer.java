package edu.kis.vh.nursery;

/**
 * Klasa DefaultCountingOutRhymer implementuje stos o ograniczonym rozmiarze.
 * Pozwala dodawać, usuwać oraz podglądać wartości całkowite przy użyciu tablicy.
 */
public class DefaultCountingOutRhymer {

    public static final int EMPTY_INDEX = -1;
    public static final int MAX_SIZE = 12;
    private final int[] NUMBERS = new int[MAX_SIZE];

    public int total = EMPTY_INDEX;

    /**
     * Dodaje element na stos, jeśli nie jest pełny.
     *
     * @param in wartość całkowita do dodania
     */
    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    /**
     * Sprawdza, czy stos jest pusty.
     *
     * @return true jeśli pusty, false w przeciwnym razie
     */
    public boolean callCheck() {
        return total == -1;
    }

    /**
     * Sprawdza, czy stos jest pełny.
     *
     * @return true jeśli pełny, false w przeciwnym razie
     */
    public boolean isFull() {
        return total == 11;
    }

    /**
     * Zwraca element ze szczytu stosu bez jego usuwania.
     *
     * @return wartość ze szczytu stosu lub -1 jeśli stos pusty
     */
    protected int peekaboo() {
        if (callCheck())
            return -1;
        return NUMBERS[total];
    }

    /**
     * Zwraca element ze szczytu stosu i usuwa go.
     *
     * @return wartość ze szczytu stosu lub -1 jeśli stos pusty
     */
    public int countOut() {
        if (callCheck())
            return -1;
        return NUMBERS[total--];
    }
}

