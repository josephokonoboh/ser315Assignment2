package core;

class Pawn {
    private boolean isNormalPiece = true;
    private final Board.Direction direction;

    public Pawn(Board.Direction direction) {
        this.direction = direction;
    }

    public void crownMe() {
        this.isNormalPiece = false;
    }

    public boolean isNormal() {
        return isNormalPiece;
    }
}
