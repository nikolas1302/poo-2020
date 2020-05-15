
  public class complejo
  {

    private float real;
    private float imag;

    complejo suma(complejo c) 
    {
      complejo res = new complejo();
      res.real = this.real + c.real;
      res.imag = this.imag + c.imag;
      return res;
    }

    complejo resta(complejo c, complejo c1) 
    {
      complejo res = new complejo();
      res.real = this.real - c.real;
      res.imag = this.imag - c.imag;
      return res;

    }

    complejo mult(complejo c, complejo c1) 
    {
      complejo res = new complejo();
      res.real = (this.real * c1.real) - (this.imag * c1.imag);
      res.imag = (this.real * c1.imag) + (this.imag * c1.real);
      return res;
    }

    complejo conjugado(complejo c) 
    {
      complejo res = new complejo();
      res.real = c.real;
      res.imag = c.imag * -1;
      return res;
    }

     
    void imprimir()
    {
      if(c.real==0)
      {
       if(c.imag==0)
       {
        system.out.println(0);
       }else
       {
          system.out.println(c,imag+"i");
       }
      }else if(c.imag==0)
      {
        system.out.println(c.real);
      }else if(c.imag<0){
        system.out.println(c.real+""+c.imag+"i");
      }else
      {
        system.out.println(c.real+"+"+c.imag+"i");
      }
    }
  void leer () 
  {
    Scanner s=new scanner (system.in);
    complejo c=new complejo() ;
    c.real=s.nextfloat();
    c.imag=s.nextFloat();
    return c ;
  }
}