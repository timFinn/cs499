/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Your Name <timothy>
 */
public class Planet extends CelestialObject {
    public String planetName;
    public double lScal;
    public double lProp;
    public double aScal;
    public double aProp;
    public double eScal;
    public double eProp;
    public double iScal;
    public double iProp;
    public double wScal;
    public double wProp;
    public double oScal;
    public double oProp;

    public Planet(String planetName, double lScal, double lProp, double aScal, double aProp, double eScal, double eProp, double iScal, double iProp, double wScal, double wProp, double oScal, double oProp) {
        this.planetName = planetName;
        this.lScal = lScal;
        this.lProp = lProp;
        this.aScal = aScal;
        this.aProp = aProp;
        this.eScal = eScal;
        this.eProp = eProp;
        this.iScal = iScal;
        this.iProp = iProp;
        this.wScal = wScal;
        this.wProp = wProp;
        this.oScal = oScal;
        this.oProp = oProp;
    }
    
    public void calcMercury()
    {
        
    }
    
    public void calcVenus()
    {
        
    }
    
    public void calcEarth()
    {
        
    }
    
    public void calcMars()
    {
        
    }
    
    public void calcJupiter()
    {
        
    }
    
    public void calcSaturn()
    {
        
    }
    
    public void calcUranus()
    {
        
    }
    
    public void calcNeptune()
    {
        
    }
    
    public void calcPluto()
    {
        
    }
}
