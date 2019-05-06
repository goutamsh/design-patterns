package com.gshepur.iterator;

import java.util.Iterator;

public class IteratorDemoMain {

    public static void main(String[] args) {

        MusicInstrumentRepository musicInstrumentRepository = new MusicInstrumentRepository();

        musicInstrumentRepository.add("Harmonica");
        musicInstrumentRepository.add("Piano");
        musicInstrumentRepository.add("Guitar");
        musicInstrumentRepository.add("Flute");

        System.out.println("Iterator using foreach");
        for (String s:musicInstrumentRepository) {
            System.out.println(s);
        }

        System.out.println("Iterator using while loop");
        Iterator<String> iterator = musicInstrumentRepository.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
