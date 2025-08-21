package minefield;

public enum Heading {
    N, W, E, S, NE, NW, SE, SW;

    public static Heading parse(String string){
        if (string.equalsIgnoreCase("N")) return N;
        if (string.equalsIgnoreCase("E")) return E;
        if (string.equalsIgnoreCase("S")) return S;
        if (string.equalsIgnoreCase("W")) return W;
        if (string.equalsIgnoreCase("NE")) return NE;
        if (string.equalsIgnoreCase("NW")) return NW;
        if (string.equalsIgnoreCase("SE")) return SE;
        if (string.equalsIgnoreCase("SW")) return SW;
        return null;
        }

}
