package pt.ipbeja.po2.tictactoe.model;

import java.util.Objects;

/**
 * @author Diogo Pina Manique
 * @author João Paulo barros
 * @version 13/03/2021, 26/03/2022
 */

public record Position(int row, int col) {}

//public class Position {
//
//    //private Place player; // FIXME Considerar guardar o player com a posição
//    private final int row;
//    private final int col;
//
//    public Position(int row, int col) {
//        this.row = row;
//        this.col = col;
//    }
//
//    public int row() { // getRow()
//        return this.row;
//    }
//
//    public int col() { // getCol()
//        return this.col;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Position position = (Position) o;
//        return row == position.row && col == position.col;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(row, col);
//    }
//}
