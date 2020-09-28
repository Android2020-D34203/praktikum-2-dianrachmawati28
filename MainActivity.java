public class Mainactivity extends AppCompatActivity {
    EditText Number, Number2, Operasi;
    Button button;
    TextView text Hasil;
    @override
    protected void onCreate (Bundle storedinstanceState) {
        super.onCreate (storedinstancestate);
        setContentview (R.layout.activity_main);  -

                Number		= findViewById(R.1d. Number);
        Number 2	= findViewById(R.1d. Number2);
        Operasi		= findViewById(R.1d. Operasi);
        button		= findViewById(R.1d. tombol);
        textHasil	= findViewById(R.1d. textHasil);

    }

    public void HasilOperasi (View v) {
        double Hasil;
        int input1 = Integer-parseInt (Number-getText().toString ());
        int input2 = Integer-parseInt (Number-getText().toString ());
        String aritmatika = Operasi.getText().toString();

        if (aritmatika.equals ("+")){
            (Hasil = input1 + input2;
            textHasil.setText (String.valueOf (Hasil));
            Else if (aritmatika.equals ("-")){
                (Hasil = input1 - input2;
                textHasil.setText (String.valueOf (Hasil));
                Else if (aritmatika.equals ("*")){
                    (Hasil = input1 * input2;
                    textHasil.setText (String.valueOf (Hasil));
                    Else if (aritmatika.equals ("/")){
                        (Hasil = input1 / input2;
                        textHasil.setText (String.valueOf (Hasil));
                    }else {
                        textHasil.setText("OPERASI ARITMATIKA TIDAK SESUAI");