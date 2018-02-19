package com.edgarhandev.edgar.deckofcards;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class MainActivity extends AppCompatActivity {

    public Deck deck;
    public Button shuffle;
    public ImageView imageView;
    public TextView textView;
    public int cardsCount;
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardsCount = 52;
        deck = new Deck();
        shuffle = (Button)findViewById(R.id.shuffle);
        shuffle.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                deck.newShuffleDeck();
                cardsCount = 52;
                updateCardsCount();
            }
        });
        imageView = (ImageView)findViewById(R.id.imageView);
        imageView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                getNewCard();
            }
        });
        textView = (TextView)findViewById(R.id.textView);

        // Sample AdMob app ID: ca-app-pub-3940256099942544~3347511713
        String YOUR_ADMOB_APP_ID = "ca-app-pub-5445092696369420~9421736633";
        MobileAds.initialize(this, YOUR_ADMOB_APP_ID);

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }

    public void getNewCard() {
        switch(deck.getNextCard()) {
            case ACE_SPADES: imageView.setImageResource(R.drawable.ace_of_spades);
                break;
            case ACE_CLUBS: imageView.setImageResource(R.drawable.ace_of_clubs);
                break;
            case ACE_DIAMONDS: imageView.setImageResource(R.drawable.ace_of_diamonds);
                break;
            case ACE_HEARTS: imageView.setImageResource(R.drawable.ace_of_hearts);
                break;
            case TWO_SPADES: imageView.setImageResource(R.drawable.two_of_spades);
                break;
            case TWO_CLUBS: imageView.setImageResource(R.drawable.two_of_clubs);
                break;
            case TWO_DIAMONDS: imageView.setImageResource(R.drawable.two_of_diamonds);
                break;
            case TWO_HEARTS: imageView.setImageResource(R.drawable.two_of_hearts);
                break;
            case THREE_SPADES: imageView.setImageResource(R.drawable.three_of_spades);
                break;
            case THREE_CLUBS: imageView.setImageResource(R.drawable.three_of_clubs);
                break;
            case THREE_DIAMONDS: imageView.setImageResource(R.drawable.three_of_diamonds);
                break;
            case THREE_HEARTS: imageView.setImageResource(R.drawable.three_of_hearts);
                break;
            case FOUR_SPADES: imageView.setImageResource(R.drawable.four_of_spades);
                break;
            case FOUR_CLUBS: imageView.setImageResource(R.drawable.four_of_clubs);
                break;
            case FOUR_DIAMONDS: imageView.setImageResource(R.drawable.four_of_diamonds);
                break;
            case FOUR_HEARTS: imageView.setImageResource(R.drawable.four_of_hearts);
                break;
            case FIVE_SPADES: imageView.setImageResource(R.drawable.five_of_spades);
                break;
            case FIVE_CLUBS: imageView.setImageResource(R.drawable.five_of_clubs);
                break;
            case FIVE_DIAMONDS: imageView.setImageResource(R.drawable.five_of_diamonds);
                break;
            case FIVE_HEARTS: imageView.setImageResource(R.drawable.five_of_hearts);
                break;
            case SIX_SPADES: imageView.setImageResource(R.drawable.six_of_spades);
                break;
            case SIX_CLUBS: imageView.setImageResource(R.drawable.six_of_clubs);
                break;
            case SIX_DIAMONDS: imageView.setImageResource(R.drawable.six_of_diamonds);
                break;
            case SIX_HEARTS: imageView.setImageResource(R.drawable.six_of_hearts);
                break;
            case SEVEN_SPADES: imageView.setImageResource(R.drawable.seven_of_spades);
                break;
            case SEVEN_CLUBS: imageView.setImageResource(R.drawable.seven_of_clubs);
                break;
            case SEVEN_DIAMONDS: imageView.setImageResource(R.drawable.seven_of_diamonds);
                break;
            case SEVEN_HEARTS: imageView.setImageResource(R.drawable.seven_of_hearts);
                break;
            case EIGHT_SPADES: imageView.setImageResource(R.drawable.eight_of_spades);
                break;
            case EIGHT_CLUBS: imageView.setImageResource(R.drawable.eight_of_clubs);
                break;
            case EIGHT_DIAMONDS: imageView.setImageResource(R.drawable.eight_of_diamonds);
                break;
            case EIGHT_HEARTS: imageView.setImageResource(R.drawable.eight_of_hearts);
                break;
            case NINE_SPADES: imageView.setImageResource(R.drawable.nine_of_spades);
                break;
            case NINE_CLUBS: imageView.setImageResource(R.drawable.nine_of_clubs);
                break;
            case NINE_DIAMONDS: imageView.setImageResource(R.drawable.nine_of_diamonds);
                break;
            case NINE_HEARTS: imageView.setImageResource(R.drawable.nine_of_hearts);
                break;
            case TEN_SPADES: imageView.setImageResource(R.drawable.ten_of_spades);
                break;
            case TEN_CLUBS: imageView.setImageResource(R.drawable.ten_of_clubs);
                break;
            case TEN_DIAMONDS: imageView.setImageResource(R.drawable.ten_of_diamonds);
                break;
            case TEN_HEARTS: imageView.setImageResource(R.drawable.ten_of_hearts);
                break;
            case JACK_SPADES: imageView.setImageResource(R.drawable.jack_of_spades);
                break;
            case JACK_CLUBS: imageView.setImageResource(R.drawable.jack_of_clubs);
                break;
            case JACK_DIAMONDS: imageView.setImageResource(R.drawable.jack_of_diamonds);
                break;
            case JACK_HEARTS: imageView.setImageResource(R.drawable.jack_of_hearts);
                break;
            case QUEEN_SPADES: imageView.setImageResource(R.drawable.queen_of_spades);
                break;
            case QUEEN_CLUBS: imageView.setImageResource(R.drawable.queen_of_clubs);
                break;
            case QUEEN_DIAMONDS: imageView.setImageResource(R.drawable.queen_of_diamonds);
                break;
            case QUEEN_HEARTS: imageView.setImageResource(R.drawable.queen_of_hearts);
                break;
            case KING_SPADES: imageView.setImageResource(R.drawable.king_of_spades);
                break;
            case KING_CLUBS: imageView.setImageResource(R.drawable.king_of_clubs);
                break;
            case KING_DIAMONDS: imageView.setImageResource(R.drawable.king_of_diamonds);
                break;
            case KING_HEARTS: imageView.setImageResource(R.drawable.king_of_hearts);
                break;
            case END: imageView.setImageResource(R.drawable.black_joker);
                cardsCount = 0;
                break;
        }
        updateCardsCount();
    }

    public void updateCardsCount() {
        String string;
        if (cardsCount == 1) {
            string = "" + cardsCount-- + " card left";
        } else {
            string = "" + cardsCount-- + " cards left";
        }
        textView.setText(string);
    }
}
