package khoapham.ptp.phamtanphat.freakingmath1005;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView txtNumber1,txtNumber2,txtKetqua,txtPheptinh;
    ImageButton imgDung, imgSai;
    Boolean check = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //1 : Random
//            + Random số thứ 1 và 2 < 10
//            + Random phep tinh (+ - * /)
        //2 : Xu ly giao dien
//            +Gắn giá trị số thứ 1 và thứ 2 vào giao diện
//            +Gắn kết quả sau khi thực thi phép tính
//            +Gắn phép tính vào
        //3 : Xử lý cho bài toán sai
//            + Random 1 biến true false để xử lý cho kết quả sai
        // 4: Bắt sự kiện 2 imageviewButton
//            +Nếu biến check = true va kết là đúng thì ok có điểm
//            +Nếu check = false va kết quả là sai thì có điểm
        txtNumber1 = findViewById(R.id.textviewNumber1);
        txtNumber2 = findViewById(R.id.textviewNumber2);
        txtKetqua = findViewById(R.id.textviewKetqua);
        txtPheptinh = findViewById(R.id.textviewPhepTinh);
        imgDung = findViewById(R.id.imagebuttontrue);
        imgSai = findViewById(R.id.imagebuttonfalse);

        Random random = new Random();
        int number1 = random.nextInt(10) + 1;
        int number2 = random.nextInt(10) + 1;

        int toantu = random.nextInt(4) + 1;
        check = random.nextBoolean();
        int ketqua = 0;

        switch (toantu){
            case 1 : ketqua = number1 + number2;
                txtPheptinh.setText("+");
                break;
            case 2 : ketqua = number1 - number2;
                txtPheptinh.setText("-");
                break;
            case 3 : ketqua = number1 * number2;
                txtPheptinh.setText("*");
                break;
            case 4 : ketqua = number1 / number2;
                txtPheptinh.setText("/");
                break;
        }
        if(check == false){
            ketqua += 5;
        }
        Toast.makeText(this, check + "", Toast.LENGTH_SHORT).show();
        txtNumber1.setText(number1 + "");
        txtNumber2.setText(number2 + "");
        txtKetqua.setText(" = " + ketqua);

    }
}
