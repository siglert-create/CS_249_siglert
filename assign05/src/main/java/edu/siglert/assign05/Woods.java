package edu.siglert.assign05;


import java.util.ArrayList;

public class Woods {
    private final ArrayList<Giant> giants = new ArrayList<>();

    public Giant createGiant(String name, String typeName) {
        if (name.isEmpty()) {
            return null;
        }
        return switch (typeName.toUpperCase()) {
            case "GIANT" -> new Giant(name);
            case "TROLL" -> new Troll(name);
            case "TREE" -> new Tree(name);
            case "ENT" -> new Ent(name);
            case "HUORN" -> new Huorn(name);
            default -> null;
        };

    }

    public boolean addGiant(String name, String typeName) {
        Giant g = createGiant(name, typeName);
        if (g != null) {
            giants.add(g);
            return true;
        }
        return false;
    }

    public Giant getGiant(int index) {
        if (index >= 0 && index < giants.size()) {
            return giants.get(index);
        } else {
            return null;
        }
    }

    public void printAllGiants() {
        System.out.println("ALL GIANTS:");
        for (Giant g : giants) {
            System.out.println("- " + g.toString());
        }
    }

    public void printAllTrees() {
        System.out.println("ALL TREES:");
        for (Giant g : giants) {
            if (g instanceof Tree) {
                Tree t = (Tree) g;
                System.out.println("- " + t + ": " + t.speak());
            }
        }
    }


    public void printAllTrolls() {
        System.out.println("ALL TROLLS:");
        for (Giant g : giants) {
            if (g instanceof Troll) {
                Troll t = (Troll) g;
                System.out.println("- " + t.toString() + ": " + t.cook());
            }
        }
    }
}