package edu.siglert.assign06;
import edu.siglert.assign04.GameBoard;
import java.util.*;
import java.io.*;
public class GameState implements Loadable {
    private final List<Loadable> loadable;
    private final GameBoard baseMap;
    public GameState() {
        this.loadable = new ArrayList<>();
        this.baseMap = new GameBoard(12, 30, '.');
    }
    public Loadable createLoadable(String typeName) throws GameFileException {
        return switch (typeName) {
            case "Skeleton" -> new Skeleton();
            case "Rat" -> new Rat();
            case "Item" -> new Item();
            case "Tome" -> new Tome();
            case null, default -> throw new GameFileException("Unknown type: " + typeName);
        };
    }
    public void load(Scanner input) throws GameFileException {
        baseMap.clear();
        loadable.clear();
        int numLines = input.nextInt();
        for (int i = 0; i < numLines; i++) {
            String typeName = input.next();
            Loadable m = createLoadable(typeName);
            m.load(input);
            loadable.add(m);
            if (m instanceof Drawable d) {
                d.draw(baseMap);
            }
        }
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MAP:\n");
        sb.append(baseMap.getBoardString());
        sb.append("\n");
        sb.append("CREATURES:\n");
        for (Loadable c : loadable) {
            if (c instanceof Creature) {
                sb.append("* ");
                sb.append(c);
                sb.append("\n");
            }
        }
        sb.append("INVENTORY:\n");
        for (Loadable item : loadable) {
            if (item instanceof Item ) {
                sb.append("* ");
                sb.append(item);
                sb.append("\n");
            }
        }
        return sb.toString();
    }
    public void save(String filename) throws GameFileException {
        try{
            PrintWriter writer = new PrintWriter(filename);
            writer.print(this);
            writer.close();
        }
        catch (Exception e){
            throw new GameFileException("Failed to save file!", e);
        }
    }
}