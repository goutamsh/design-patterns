package com.gshepur.state;

public class Fan {

    private State offState;
    private State lowState;
    private State medState;
    private State highState;

    private State state;

    public Fan(){
        offState = new OffState(this);
        lowState = new LowState(this);
        medState = new MedState(this);
        highState = new HighState(this);

        state = offState;
    }

    public void pullChain(){
        state.handle();
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getOffState() {
        return offState;
    }

    public State getLowState() {
        return lowState;
    }

    public State getMedState() {
        return medState;
    }

    public State getHighState() {
        return highState;
    }
}
