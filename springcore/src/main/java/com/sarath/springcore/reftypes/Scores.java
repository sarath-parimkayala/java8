package com.sarath.springcore.reftypes;

public class Scores {
	private Double maths;
	private Double physics;
	private Double Chemistry;
	public Double getMaths() {
		return maths;
	}
	public void setMaths(Double maths) {
		this.maths = maths;
	}
	public Double getPhysics() {
		return physics;
	}
	public void setPhysics(Double physics) {
		this.physics = physics;
	}
	public Double getChemistry() {
		return Chemistry;
	}
	public void setChemistry(Double chemistry) {
		Chemistry = chemistry;
	}
	@Override
	public String toString() {
		return "Scores [maths=" + maths + ", physics=" + physics + ", Chemistry=" + Chemistry + "]";
	}

}
