package miniprojeler.netmaashesaplama;

public class NetMaasHesaplama implements YillikExtra, AylikExtra, Vergi {


    @Override
    public double aylikExtra(double calismaSaati) {
        if (calismaSaati-160>0){

        }
        return    (calismaSaati-160)*10;
    }

    @Override
    public double vergiKesintisi(double brutMaas, double calismaYili) {
        if (calismaYili>=10){
           return brutMaas*0.30;
        }else {
            return brutMaas*0.20;}
    }

    @Override
    public double yillikEkstra(int calismaYili) {
        return calismaYili*100;
    }

    double netMaas(double brutMaas,int  calismYii,int  calsmasaati){
        return brutMaas+yillikEkstra(calismYii)+aylikExtra(calsmasaati)-vergiKesintisi(brutMaas,calismYii);
    }
}
