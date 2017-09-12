package mx.iteso.is705419.tarea01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;
import android.widget.*;
import android.support.v7.app.AlertDialog;
import android.content.DialogInterface;


public class ActivityMain extends AppCompatActivity {

    RadioButton bottonFemenino;
    RadioButton bottonMasculino;
    EditText nombre;
    EditText telefono;
    Spinner grado;
    Button limpiar;
    AutoCompleteTextView autocompletar;
    CheckBox deporte;
    Alumno alumno;

    private static final String[] BOOKS = new String[] {
            "El hombre sin atributos",
            "Las metamorfosis",
            "Harry Potter",
            "El señor de los anillos",
            "50 Sombras de Grey"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        limpiar = (Button) findViewById(R.id.clean) ;
        nombre = (EditText) findViewById(R.id.nombre_text) ;
        telefono = (EditText) findViewById(R.id.telefono_text) ;
        autocompletar = (AutoCompleteTextView) findViewById(R.id.autocompletar) ;
        bottonFemenino = (RadioButton) findViewById(R.id.Femenino);
        bottonMasculino = (RadioButton) findViewById(R.id.Masculino);
        deporte = (CheckBox) findViewById(R.id.deporteID) ;
        grado = (Spinner) findViewById(R.id.spinner_id) ;

        limpiar.setOnClickListener
                (new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder dialog = new AlertDialog.Builder(ActivityMain.this);
                dialog.setMessage("Desea limpiar el contenido?")
                        .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                cleanValues();
                            }
                        })
                        .setNegativeButton("Cancelar",
                                new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                            }
                        }).show();
            }
        });
        ArrayAdapter<String> booksAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, BOOKS);
        autocompletar.setAdapter(booksAdapter);
    }

    public void cleanValues() {
        nombre.setText("");
        telefono.setText("");
        grado.setSelection(0);
        autocompletar.setText("");
        bottonFemenino.setChecked(true);
        deporte.setChecked(false);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.activity_main, menu);

        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.activity_main_save:
                saveValues();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
    public void saveValues() {
        String genero = (bottonFemenino.isChecked())
                ? "Femenino" : "Masculino";
        alumno =
                new Alumno(nombre.getText().toString(),
                telefono.getText().toString()
                        , grado.getSelectedItem().toString(),
                genero, autocompletar.getText().toString(), deporte.isChecked());

        Toast.makeText(ActivityMain.this, alumno.toString(), Toast.LENGTH_LONG).show();
        cleanValues();
    }

}
