package org.example.day3;

public class RateVault {

    private int gamma;
    private int epsilon;

    public RateVault(int gamma, int epsilon) {
        this.gamma = gamma;
        this.epsilon = epsilon;
    }

    public RateVault() {
    }

    public void setGamma(int gamma) {
        this.gamma = gamma;
    }

    public void setEpsilon(int epsilon) {
        this.epsilon = epsilon;
    }
}
