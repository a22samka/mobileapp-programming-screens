
# Rapport

Först skapade jag en ny activity, efter detta så lade jag till en button i min layout. Denna knappen
kopplades då så att den öppnade den andra activityn. Sedan gjorde jag en string och en int som innehöll
datan som skickas med när man trycker på knappen. ![img_1.png](img_1.png)

    
    Knapp.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
    startActivity(new Intent(MainActivity.this, MainActivity2.class));
    Bengt = new Intent(MainActivity.this, MainActivity2.class);
    Bengt.putExtra("name", "Arne"); // Optional
    Bengt.putExtra("number",  55 ); // Optional
    startActivity(Bengt);

    }});
Det som syns på koden ovan är koden för vad som ska skickas från MainActivity till MainActivity2. 
När man klickar på knappen skickas detta och startar den nya activityn.(![img.png](img.png))


Efter detta gjorde jag en textView som skulle visa denna datan på den andra sidan.

    Bundle extras = getIntent().getExtras();
    if (extras != null) {
    Namn = extras.getString("name");
    Nummer = extras.getInt("number");
    textview =findViewById(R.id.textView2);
    textview.setText(Namn+Nummer);

Koden ovan, tagen från MainActivity2 visar hur textviewn som visar datan från 
MainActivity är uppsatt. 