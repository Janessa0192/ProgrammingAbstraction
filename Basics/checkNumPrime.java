int n = 17;
boolean prime = true;

if (n < 2) {
    prime = false;
}

for(int i=2;i*i<=n;i++){

    if(n%i==0){
        prime=false;
        break;
    }
}

if(prime) return "yes";
else return "no";