package org.codersparks.elite.edsc.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class EDSCFilter {

	/**
	 * Allows the definition of a Sphere Coord filter object
	 * 
	 * @author Mark
	 *
	 */
	public class SphereCoord {

		private float radius;
		private float[] origin = new float[3];

		public float getRadius() {
			return radius;
		}

		public void setRadius(float radius) {
			this.radius = radius;
		}

		public float[] getOrigin() {
			return origin;
		}

		public void setOrigin(float[] origin) {

			if (origin.length != 3) {
				throw new IllegalArgumentException(
						"Origin array must contain 3 float values [x, y, z]");
			}

			this.origin = origin;
		}

	}

	private Integer knownstatus = null;
	private String systemname = null;
	private Integer cr = null;
	private String date = null;

	// coord cube to filter by format:
	// [[xmin,xmax][ymin,ymax][zmin,zmax]]
	private float[][] coordcube = null;

	private SphereCoord coordsphere = null;

	public Integer getKnownstatus() {
		return knownstatus;
	}

	public void setKnownstatus(Integer knownstatus) {
		this.knownstatus = knownstatus;
	}

	public String getSystemname() {
		return systemname;
	}

	public void setSystemname(String systemname) {
		this.systemname = systemname;
	}

	public Integer getCr() {
		return cr;
	}

	public void setCr(Integer cr) {
		this.cr = cr;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public float[][] getCoordcube() {
		return coordcube;
	}

	public void setCoordcube(float[][] coordcube) {
		
		// Test that the size of the array is correct
		int tempLength = coordcube.length;
		
		if(tempLength != 3) {
			throw new IllegalArgumentException("Coord cube supplied must contain 3 sets of min/max points, i.e. [[xmin,xmax][ymin,ymax][zmin,zmax]], supplied: " + coordcube);
		}
		
		for(int i = 0; i < 3; i++) {
			if(coordcube[i].length != 2) {
				throw new IllegalArgumentException("Coord cube supplied must contain 3 sets of min/max points, i.e. [[xmin,xmax][ymin,ymax][zmin,zmax]], supplied: " + coordcube);
			}
		}
		
		this.coordcube = coordcube;
	}

	public SphereCoord getCoordsphere() {
		return coordsphere;
	}

	public void setCoordsphere(SphereCoord coordsphere) {
		this.coordsphere = coordsphere;
	}

}
