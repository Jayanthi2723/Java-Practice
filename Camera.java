import java.lang.*;
class Camera{
  String brand;
  int pixel;
  public Camera(String brand,int pixel){
    this.brand=brand;
    this.pixel=pixel;
  }
  public boolean equals(Object obj){
    Camera e=(Camera)obj;
    if(this.brand==e.brand && this.pixel==e.pixel)
      return true;
    else
      return false;
  }
  public int hashcode(){
    int hc=Object.has(brand,pixel);
    return hc;
  }
}
