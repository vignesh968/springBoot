package com.vignesh.Springcore.Reference;

public class Student {
private Scores scores;

public Scores getScores() {
	return scores;
}

public void setScores(Scores scores) {
	this.scores = scores;
}

@Override
public String toString() {
	return "Student [scores=" + scores + "]";
}

}
