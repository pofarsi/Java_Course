package lecture09.cw9.PlayList;

import java.util.*;

public class Main {
    private static ArrayList<Album> albums = new ArrayList<>();

    public static void main(String[] args) {

        Album album = new Album("Album Name", "Artist Name");
        albums.add(album);
//        album = new Album("Album Name ", "Artist Name ");
        album.addSong("Song 1--> ", 3.00);
        album.addSong("Song 2--> ", 3.04);
        album.addSong("Song 3--> ", 3.50);
        album.addSong("Song 4--> ", 3.43);
        album.addSong("Song 5--> ", 3.86);
        albums.add(album);

        LinkedList<Song> playList = new LinkedList<>();
        albums.get(1).addToPlayList("Song 3.1 --> ", playList);
        albums.get(1).addToPlayList("Song 3.2--> ", playList);
        albums.get(1).addToPlayList("Song 3.3--> ", playList);
        albums.get(1).addToPlayList(0, playList);
        albums.get(1).addToPlayList(1, playList);
        albums.get(1).addToPlayList(2, playList);
        albums.get(1).addToPlayList(3, playList);
        albums.get(1).addToPlayList(4, playList);
        albums.get(1).addToPlayList(5, playList);

        play(playList);
    }

    private static void play(LinkedList<Song> playlist) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playlist.listIterator();
        if (playlist.size() == 0) {
            System.out.println("No songs in playlist");
        } else {
            System.out.println("Now playing " + listIterator.next().toString());
            printMenu();
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("Playlist complete");
                    quit = true;
                    break;
                case 1:
                    if (!forward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next().toString());
                    } else {
                        System.out.println("We have reached the end of the playlist");
                        forward = false;
                    }
                    break;
                case 2:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous().toString());
                        forward = true;
                    } else {
                        System.out.println("We are at the start of the playlist");
                    }
                    break;
                case 3:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            System.out.println("Now playing " + listIterator.previous().toString());
                            forward = false;
                        } else {
                            System.out.println("We are at the start of the playlist");
                        }
                    } else {
                        if (listIterator.hasNext()) {
                            System.out.println("Now replaying " + listIterator.next().toString());
                            forward = true;
                        } else {
                            System.out.println("We have reached the end of the playlist");
                        }
                    }
                    break;
                case 4:
                    printList(playlist);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if (playlist.size() > 0) {
                        listIterator.remove();
                        if (listIterator.hasNext()) {
                            System.out.println("Now playing " + listIterator.next());
                        } else if (listIterator.hasPrevious()) {
                            System.out.println("Now playing " + listIterator.previous());
                        }
                    }
            }
        }
    }

    private static void printMenu() {
        System.out.println("Available actions:\npress");
        System.out.println("0 - to quit\n" +
                "1 - to play next song\n" +
                "2 - to play previous song\n" +
                "3 - to replay the current song\n" +
                "4 - list songs in playlist\n" +
                "5 - print available actions.\n" +
                "6 - remove current song from playlist");
    }

    private static void printList(LinkedList<Song> playlist) {
        Iterator<Song> iterator = playlist.iterator();
        System.out.println("=============================");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("=============================");
    }
}