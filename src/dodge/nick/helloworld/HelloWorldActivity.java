package dodge.nick.helloworld;

import java.util.Random;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

public class HelloWorldActivity extends Activity {

	TextView response;
	int button_pressed;
	int button_count;

	String[] diff_response = {
			"Is this thing on?",
			"lolz",
			"Today is a good day to die!",
			"Nope",
			"Alright Ill Bite",
			"Today Looks Good",
			"Today Looks Bad",
			"Too Early to Tell",
			"If you eat a fortune cookie you will have good fortune",
			"He says 'jump', you say 'how high?'",
			"YOLO",
			"YODA",
			"If you want to improve, be content to be thought foolish and stupid",
			"It is not he who reviles or strikes you who insults you, but your opinion that these things are insulting",
			"It is impossible to begin to learn that which one thinks one already knows",
			"We have two ears and one mouth so that we can listen twice as much as we speak.",
			"He is a wise man who does not grieve for the things which he has not, but rejoices for those which he has",
			"When you are offended at any man’s fault, turn to yourself and study your own failings. Then you will forget your anger",
			"There is only one way to happiness and that is to cease worrying about things which are beyond the power of our will",
			"I must die. Must I then die lamenting? I must be put in chains. Must I then also lament? I must go into exile. Does any man then hinder me from going with smiles and cheerfulness and contentment?",
			"It is not death or pain that is to be dreaded, but the fear of pain or death.",
			"Old habits die hard.",
			"Nothing ventured, nothing gained",
			"The early bird gets the worm",
			"As you make your bed, so you must lie in it.",
			"A friend in need is a friend indeed",
			"A Bird In The Hand Is Worth Two In The Bush"
			
	};

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

	}

	protected void onResume(){
		super.onResume();

	}

	public void onPause(){
		super.onPause();

	}


	private final Runnable mUpdateUITimerTask = new Runnable() {
		public void run() {

				TextView response = (TextView)findViewById(R.id.textView2);

				response.setText("");

				button_pressed = 0;
		}
	};
	
	private final Handler mHandler = new Handler();

	public void myClickHandler(View view) {

		switch (view.getId()) {

			case R.id.button1:
			{
				if(button_pressed == 0){
					Random gen = new Random();
					int r = gen.nextInt(25);

					TextView response = (TextView)findViewById(R.id.textView2);

					response.setText(diff_response[r]);

					mHandler.removeCallbacks(mUpdateUITimerTask);
					mHandler.postDelayed(mUpdateUITimerTask, 4 * 1000);

				}

				return;
			}
		}
	}   
}


