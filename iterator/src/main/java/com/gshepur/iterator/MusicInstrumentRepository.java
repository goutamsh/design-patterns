package com.gshepur.iterator;

import java.util.Iterator;

public class MusicInstrumentRepository implements Iterable<String>{

    private String[] musicInstruments;
    private int index;

    public MusicInstrumentRepository(){
        musicInstruments = new String[10];
        index = 0;
    }

    public void add(String item){

        ensureCapacity();

        musicInstruments[index++] = item;
    }

    private void ensureCapacity() {
        if(index == musicInstruments.length){
            String[] newArray = new String[musicInstruments.length*2];
            System.arraycopy(musicInstruments, 0, newArray, 0 , musicInstruments.length);
            musicInstruments = newArray;
        }
    }

    @Override
    public Iterator<String> iterator() {
        return new MusicIterator();
    }

    private class MusicIterator implements Iterator<String>{

        private int currentIndex;

        public MusicIterator(){
            currentIndex = 0;
        }

        @Override
        public boolean hasNext() {
            return currentIndex < musicInstruments.length && musicInstruments[currentIndex] != null;
        }

        @Override
        public String next() {
            return musicInstruments[currentIndex++];
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
}


