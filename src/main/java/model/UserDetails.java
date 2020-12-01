package model;

public class UserDetails

{
    private String rname;
    private String remail;
    private String rpwd;
    private String rnumber;


    public UserDetails(String rname,String remail,String rpwd, String rnumber)
    {
        this.rname=rname;
        this.remail=remail;
        this.rpwd=rpwd;
        this.rnumber=rnumber;
    }


    public String getUsername (){ return rname;};
    public void setUsername(){ this.rname=rname;};
    public String getUseremail(){ return remail;};
    public void setUseremail(){ this.remail=remail;};
    public String getUserpwd(){ return rpwd;};
    public void setUserpwd(){ this.rpwd= rpwd;};
    public String getUsernumber(){ return rnumber;};
    public void setUsernumber(){ this.rnumber=rnumber;};


}
