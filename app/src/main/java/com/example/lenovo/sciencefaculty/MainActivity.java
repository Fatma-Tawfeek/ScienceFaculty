package com.example.lenovo.sciencefaculty;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Spinner faculty = (Spinner)findViewById(R.id.faculty);
        final Spinner department = (Spinner)findViewById(R.id.department);
        final Spinner material = (Spinner)findViewById(R.id.material);

        ArrayAdapter adapter= ArrayAdapter.createFromResource(this,R.array.faculty,android.R.layout.simple_spinner_dropdown_item);
        faculty.setAdapter(adapter);


        faculty.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (faculty.getSelectedItem().toString().equals("Science Faculty")) {
                    department.setVisibility(View.VISIBLE);
                    ArrayAdapter departmentAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                            R.array.departmentSC, android.R.layout.simple_spinner_dropdown_item);
                    department.setAdapter(departmentAdapter);
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        department.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    public void onItemSelected(
                            AdapterView<?> parent, View view, int position, long id) {
                        if(department.getSelectedItem().toString().equals("First Year")) {
                            material.setVisibility(View.VISIBLE);
                            ArrayAdapter yearAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                    R.array.materialFY, android.R.layout.simple_spinner_dropdown_item);
                            material.setAdapter(yearAdapter);
                        }
                        else if(department.getSelectedItem().toString().equals("Industrial Chemistry")) {
                            material.setVisibility(View.VISIBLE);
                            ArrayAdapter yearAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                    R.array.materialIC, android.R.layout.simple_spinner_dropdown_item);
                            material.setAdapter(yearAdapter);
                        }
                        else if(department.getSelectedItem().toString().equals("Biochemistry")) {
                            material.setVisibility(View.VISIBLE);
                            ArrayAdapter yearAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                    R.array.materialBC, android.R.layout.simple_spinner_dropdown_item);
                            material.setAdapter(yearAdapter);
                        }
                        else if(department.getSelectedItem().toString().equals("Petroleum Geology and Natural Gas")) {
                            material.setVisibility(View.VISIBLE);
                            ArrayAdapter yearAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                    R.array.materialPG, android.R.layout.simple_spinner_dropdown_item);
                            material.setAdapter(yearAdapter);
                        }
                        else if(department.getSelectedItem().toString().equals("Physics")) {
                            material.setVisibility(View.VISIBLE);
                            ArrayAdapter yearAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                    R.array.materialPH, android.R.layout.simple_spinner_dropdown_item);
                            material.setAdapter(yearAdapter);
                        }
                        else if(department.getSelectedItem().toString().equals("Mathematics")) {
                            material.setVisibility(View.VISIBLE);
                            ArrayAdapter yearAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                    R.array.materialMA, android.R.layout.simple_spinner_dropdown_item);
                            material.setAdapter(yearAdapter);
                        }
                        else if(department.getSelectedItem().toString().equals("Microbiology")) {
                            material.setVisibility(View.VISIBLE);
                            ArrayAdapter yearAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                    R.array.materialMI, android.R.layout.simple_spinner_dropdown_item);
                            material.setAdapter(yearAdapter);
                        }
                        else if(department.getSelectedItem().toString().equals("Biotechnology")) {
                            material.setVisibility(View.VISIBLE);
                            ArrayAdapter yearAdapter = ArrayAdapter.createFromResource(MainActivity.this,
                                    R.array.materialBI, android.R.layout.simple_spinner_dropdown_item);
                            material.setAdapter(yearAdapter);
                        }

                    }

                    public void onNothingSelected(AdapterView<?> parent) {
                    }
                });

        material.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    public void onItemSelected(
                            AdapterView<?> parent, View view, int position, long id) {
                        if(material.getSelectedItem().toString().equals("حقوق انسان")){
                            Intent i = new Intent(MainActivity.this,study.class);
                            i.putExtra("url","https://drive.google.com/drive/folders/1Blaktt58ohJi1AgJ_KyyvPL8Wi2xzEWB");
                            startActivity(i);
                        }
                        else if(material.getSelectedItem().toString().equals("حرارة وخواص د.بهجت")){
                            Intent i = new Intent(MainActivity.this,study.class);
                            i.putExtra("url","https://drive.google.com/drive/folders/0B31vLTnOP-SIeVN5VnJ4cEZBVkE");
                            startActivity(i);
                        }
                        else if(material.getSelectedItem().toString().equals("مقدمة فى علم الحاسب د.وائل فواز")){
                            Intent i = new Intent(MainActivity.this,study.class);
                            i.putExtra("url","https://drive.google.com/drive/folders/0Bx1TXZ-UjRgucXo5ZHc5T3N0d00");
                            startActivity(i);
                        }
                        else if(material.getSelectedItem().toString().equals("تحليل رياضى 2 د.هبة")){
                            Intent i = new Intent(MainActivity.this,study.class);
                            i.putExtra("url","https://drive.google.com/drive/folders/0ByJz1l2rodbFTW1pdWhqd0txQlk");
                            startActivity(i);
                        }

                        else if(material.getSelectedItem().toString().equals("جيولوجيا عامة د.اسماعيل")){
                            Intent i = new Intent(MainActivity.this,study.class);
                            i.putExtra("url","https://drive.google.com/drive/folders/0B31vLTnOP-SITzV1N3had3hFdUE");
                            startActivity(i);
                        }
                        else if(material.getSelectedItem().toString().equals("عينات صخور ومعادن")){
                            Intent i = new Intent(MainActivity.this,study.class);
                            i.putExtra("url","https://drive.google.com/drive/folders/0Bx1TXZ-UjRgucmJ5bWFIXzBRRFU");
                            startActivity(i);
                        }
                        else if(material.getSelectedItem().toString().equals("كيمياء فيزيائية د.شيماء")){
                            Intent i = new Intent(MainActivity.this,study.class);
                            i.putExtra("url","https://drive.google.com/drive/folders/0B31vLTnOP-SIZzFfOWFlUkpYa3M");
                            startActivity(i);
                        }
                        else if(material.getSelectedItem().toString().equals("مقدمة فى علم الحيوان د.رانيا+د.هويدا")){
                            Intent i = new Intent(MainActivity.this,study.class);
                            i.putExtra("url","https://drive.google.com/drive/folders/0B31vLTnOP-SIVVVqbjVISURyLTg");
                            startActivity(i);
                        }
                        else if(material.getSelectedItem().toString().equals("امتحانات كيمياء صناعية")){
                            Intent i = new Intent(MainActivity.this,study.class);
                            i.putExtra("url","https://drive.google.com/drive/folders/1XV6UYQd5iMj1-TEoPvajfRqePdyKHOtq");
                            startActivity(i);
                        }
                        else if(material.getSelectedItem().toString().equals("كيمياء حيوى د.وليد")){
                            Intent i = new Intent(MainActivity.this,study.class);
                            i.putExtra("url","https://drive.google.com/drive/folders/182w5-kX6cLynxvoIVS89T6b6CUwALHan");
                            startActivity(i);
                        }
                        else if(material.getSelectedItem().toString().equals("امتحانات كيمياء حيوى")){
                            Intent i = new Intent(MainActivity.this,study.class);
                            i.putExtra("url","https://drive.google.com/drive/folders/1FtkFhC06SKaYNeLiIhZK8NLknD5-Ga6E");
                            startActivity(i);
                        }
                        else if(material.getSelectedItem().toString().equals("نارية")){
                            Intent i = new Intent(MainActivity.this,study.class);
                            i.putExtra("url","https://drive.google.com/drive/folders/0ByJz1l2rodbFUEQtNUZXOWJqdzQ");
                            startActivity(i);
                        }
                        else if(material.getSelectedItem().toString().equals("Structural Geology د.فارس")){
                            Intent i = new Intent(MainActivity.this,study.class);
                            i.putExtra("url","https://drive.google.com/drive/folders/0B31vLTnOP-SIUzIyNVgzMzdiV2M");
                            startActivity(i);
                        }
                        else if(material.getSelectedItem().toString().equals("Remote sensing د.فارس")){
                            Intent i = new Intent(MainActivity.this,study.class);
                            i.putExtra("url","https://drive.google.com/drive/folders/0ByJz1l2rodbFSFJDeV9kbjB6d0k");
                            startActivity(i);
                        }
                        else if(material.getSelectedItem().toString().equals("خرائط جيولوجية")){
                            Intent i = new Intent(MainActivity.this,study.class);
                            i.putExtra("url","https://drive.google.com/drive/folders/0ByJz1l2rodbFVF9qMktEU1dMRmM");
                            startActivity(i);
                        }
                        else if(material.getSelectedItem().toString().equals("امتحان marine")){
                            Intent i = new Intent(MainActivity.this,study.class);
                            i.putExtra("url","https://drive.google.com/drive/folders/0ByJz1l2rodbFZzU3R1otbHUwOGc");
                            startActivity(i);
                        }
                        else if(material.getSelectedItem().toString().equals("Survey")){
                            Intent i = new Intent(MainActivity.this,study.class);
                            i.putExtra("url","https://drive.google.com/drive/folders/0ByJz1l2rodbFT21IZFFNdDAza3c");
                            startActivity(i);
                        }
                        else if(material.getSelectedItem().toString().equals("Sedimentology د.حسن")){
                            Intent i = new Intent(MainActivity.this,study.class);
                            i.putExtra("url","https://drive.google.com/drive/folders/0ByJz1l2rodbFM193WHVJTlFuYlk");
                            startActivity(i);
                        }
                        else if(material.getSelectedItem().toString().equals("Microfossils د.حسن")){
                            Intent i = new Intent(MainActivity.this,study.class);
                            i.putExtra("url","https://drive.google.com/drive/folders/0ByJz1l2rodbFSjVySGdCbGhuemM");
                            startActivity(i);
                        }
                        else if(material.getSelectedItem().toString().equals("Metamorphic")){
                            Intent i = new Intent(MainActivity.this,study.class);
                            i.putExtra("url","https://drive.google.com/drive/folders/0ByJz1l2rodbFUWUtbzJtR1ZSOE0");
                            startActivity(i);
                        }
                        else if(material.getSelectedItem().toString().equals("Introduction of Structural Geology د.حسن")){
                            Intent i = new Intent(MainActivity.this,study.class);
                            i.putExtra("url","https://drive.google.com/drive/folders/0ByJz1l2rodbFRGRlYzVzUmhIMlE");
                            startActivity(i);
                        }
                        else if(material.getSelectedItem().toString().equals("Hydrogeology")){
                            Intent i = new Intent(MainActivity.this,study.class);
                            i.putExtra("url","https://drive.google.com/drive/folders/1te4KR6RLNiSaGqCmWA-c-3HsPTM2ZTtC");
                            startActivity(i);
                        }
                        else if(material.getSelectedItem().toString().equals("Hydrogeochemistry")){
                            Intent i = new Intent(MainActivity.this,study.class);
                            i.putExtra("url","https://drive.google.com/drive/folders/19pUfg8WNBwoVC5naG7LxbepJPExnK0Zy");
                            startActivity(i);
                        }
                        else if(material.getSelectedItem().toString().equals("Geophysics د.سعادة")){
                            Intent i = new Intent(MainActivity.this,study.class);
                            i.putExtra("url","https://drive.google.com/drive/folders/0ByJz1l2rodbFYkNvX29BamlPOVk");
                            startActivity(i);
                        }
                        else if(material.getSelectedItem().toString().equals("Geophysics Methods")){
                            Intent i = new Intent(MainActivity.this,study.class);
                            i.putExtra("url","https://drive.google.com/drive/folders/0ByJz1l2rodbFSEV2cEFWVy1veGM");
                            startActivity(i);
                        }
                        else if(material.getSelectedItem().toString().equals("Electrics د.سعادة")){
                            Intent i = new Intent(MainActivity.this,study.class);
                            i.putExtra("url","https://drive.google.com/drive/folders/0ByJz1l2rodbFQ0NDWFBuWlJseVE");
                            startActivity(i);
                        }
                        else if(material.getSelectedItem().toString().equals("Archeological Dating methods 2")){
                            Intent i = new Intent(MainActivity.this,study.class);
                            i.putExtra("url","https://drive.google.com/drive/folders/0ByJz1l2rodbFUGRRWUloN0lfMkk");
                            startActivity(i);
                        }
                        else if(material.getSelectedItem().toString().equals("Absolute Dating")){
                            Intent i = new Intent(MainActivity.this,study.class);
                            i.putExtra("url","https://drive.google.com/drive/folders/0ByJz1l2rodbFX294dFF5cG1kUnc");
                            startActivity(i);
                        }
                        else if(material.getSelectedItem().toString().equals("نووية واشعاعية")){
                            Intent i = new Intent(MainActivity.this,study.class);
                            i.putExtra("url","https://drive.google.com/drive/folders/0B9fM-j_4HhpGTUExanB2eXhCLTA");
                            startActivity(i);
                        }
                        else if(material.getSelectedItem().toString().equals("فزياء رياضية")){
                            Intent i = new Intent(MainActivity.this,study.class);
                            i.putExtra("url","https://drive.google.com/drive/folders/0B9fM-j_4HhpGd2hsZXM0aHNsWVk");
                            startActivity(i);
                        }
                        else if(material.getSelectedItem().toString().equals("ذرية")){
                            Intent i = new Intent(MainActivity.this,study.class);
                            i.putExtra("url","https://drive.google.com/drive/folders/0B9fM-j_4HhpGemJ2Q2NFQmpTdlk");
                            startActivity(i);
                        }
                        else if(material.getSelectedItem().toString().equals("ضوء فيزيائى د.آمنة")){
                            Intent i = new Intent(MainActivity.this,study.class);
                            i.putExtra("url","https://drive.google.com/drive/folders/1Rw_mT9tt0CUWer9GZnrJ_oB2Bb3n5tz7");
                            startActivity(i);
                        }
                        else if(material.getSelectedItem().toString().equals("جوامد 1")){
                            Intent i = new Intent(MainActivity.this,study.class);
                            i.putExtra("url","https://drive.google.com/drive/folders/0Bx1TXZ-UjRguSHM0UDRCQ2xBeDQ");
                            startActivity(i);
                        }
                        else if(material.getSelectedItem().toString().equals("معادلات تفاضلية عادية د.هبة")){
                            Intent i = new Intent(MainActivity.this,study.class);
                            i.putExtra("url","https://drive.google.com/drive/folders/0ByJz1l2rodbFRE5oWHpteTlnRm8");
                            startActivity(i);
                        }
                        else if(material.getSelectedItem().toString().equals("توبولوجى د.محمد رمضان")){
                            Intent i = new Intent(MainActivity.this,study.class);
                            i.putExtra("url","https://drive.google.com/drive/folders/0Bx1TXZ-UjRguRW93UldCdlU4QXM");
                            startActivity(i);
                        }
                        else if(material.getSelectedItem().toString().equals("تحليل مركب د.محمد صالح")){
                            Intent i = new Intent(MainActivity.this,study.class);
                            i.putExtra("url","https://drive.google.com/drive/folders/0ByJz1l2rodbFZlZ2OERSRVBKVDA");
                            startActivity(i);
                        }
                        else if(material.getSelectedItem().toString().equals("امتحانات قسم رياضة")){
                            Intent i = new Intent(MainActivity.this,study.class);
                            i.putExtra("url","https://drive.google.com/drive/folders/0ByJz1l2rodbFaVhMYjFFMDlEeTA");
                            startActivity(i);
                        }
                        else if(material.getSelectedItem().toString().equals("احصاء حيوى")){
                            Intent i = new Intent(MainActivity.this,study.class);
                            i.putExtra("url","https://drive.google.com/drive/folders/0Bx1TXZ-UjRgub29taGdWZ2EwbDQ");
                            startActivity(i);
                        }
                        else if(material.getSelectedItem().toString().equals("وراثة حيوية وجزيئية د.سامية")){
                            Intent i = new Intent(MainActivity.this,study.class);
                            i.putExtra("url","https://drive.google.com/drive/folders/0Bx1TXZ-UjRguU3U5NWtQbm03b0U");
                            startActivity(i);
                        }
                        else if(material.getSelectedItem().toString().equals("ميكروبايولوجى الغذاء وامراض النبات د.صالحة")){
                            Intent i = new Intent(MainActivity.this,study.class);
                            i.putExtra("url","https://drive.google.com/drive/folders/0Bx1TXZ-UjRguOW43STdyMnRqa0U");
                            startActivity(i);
                        }
                        else if(material.getSelectedItem().toString().equals("فطريات ووراثة ميكروبات د.عبدالحميد")){
                            Intent i = new Intent(MainActivity.this,study.class);
                            i.putExtra("url","https://drive.google.com/drive/folders/0Bx1TXZ-UjRguOW43STdyMnRqa0U");
                            startActivity(i);
                        }
                        else if(material.getSelectedItem().toString().equals("طحالب د.الهام")){
                            Intent i = new Intent(MainActivity.this,study.class);
                            i.putExtra("url","https://drive.google.com/drive/folders/0Bx1TXZ-UjRguNldCQTNXMGNfYTQ");
                            startActivity(i);
                        }
                        else if(material.getSelectedItem().toString().equals("ترشيح نبات وشكل ظاهرى د.الشحات")){
                            Intent i = new Intent(MainActivity.this,study.class);
                            i.putExtra("url","https://drive.google.com/drive/folders/0Bx1TXZ-UjRguZmU2OS1GeXBTd00");
                            startActivity(i);
                        }
                        else if(material.getSelectedItem().toString().equals("ترشيح متقدم د.الشحات")){
                            Intent i = new Intent(MainActivity.this,study.class);
                            i.putExtra("url","https://drive.google.com/drive/folders/0Bx1TXZ-UjRguTXYzM1VsSS1qelU");
                            startActivity(i);
                        }
                        else if(material.getSelectedItem().toString().equals("بكتريا عامة د.صالحة")){
                            Intent i = new Intent(MainActivity.this,study.class);
                            i.putExtra("url","https://drive.google.com/drive/folders/0Bx1TXZ-UjRgubUpnSnd0UTllWk0");
                            startActivity(i);
                        }
                        else if(material.getSelectedItem().toString().equals("امتحانات ميكروبايولوجى")){
                            Intent i = new Intent(MainActivity.this,study.class);
                            i.putExtra("url","https://drive.google.com/drive/folders/1OgbZxN1Qt7Os9zgk8vx3s4TiEAR57ygV");
                            startActivity(i);
                        }
                        else if(material.getSelectedItem().toString().equals("وراثة خلوية د.احمد عيسى")){
                            Intent i = new Intent(MainActivity.this,study.class);
                            i.putExtra("url","https://drive.google.com/drive/folders/0B9fM-j_4HhpGZEhlc3FkQW1fREU");
                            startActivity(i);
                        }
                        else if(material.getSelectedItem().toString().equals("كيمياء حيوى (كربوهيدرات) د.وليد سراج")){
                            Intent i = new Intent(MainActivity.this,study.class);
                            i.putExtra("url","https://drive.google.com/drive/folders/0B9fM-j_4HhpGazhPVXpRWVFFYm8");
                            startActivity(i);
                        }
                        else if(material.getSelectedItem().toString().equals("علم الدم د.عايدة")){
                            Intent i = new Intent(MainActivity.this,study.class);
                            i.putExtra("url","https://drive.google.com/drive/folders/0B9fM-j_4HhpGV3ZUTE1IX05iekk");
                            startActivity(i);
                        }





                    }

                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });
    }
}
