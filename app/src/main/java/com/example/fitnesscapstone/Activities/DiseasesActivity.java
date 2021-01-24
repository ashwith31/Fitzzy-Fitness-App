package com.example.fitnesscapstone.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.TextView;

import com.example.fitnesscapstone.Adapters.disAdapter;
import com.example.fitnesscapstone.R;
import com.example.fitnesscapstone.dataModels.dis_data;

import java.util.ArrayList;

public class DiseasesActivity extends AppCompatActivity {
    EditText search;

    RecyclerView rv;
disAdapter adapter;
ArrayList<dis_data> disData=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diseases);
        search=(EditText)findViewById(R.id.disact_search);
        rv=(RecyclerView)findViewById(R.id.disact_rv);
        adapter=new disAdapter(disData);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(adapter);
        populateDisease();

        search.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if(i== EditorInfo.IME_ACTION_SEARCH){
                    filterList(search.getText().toString());
                }
                return false;
            }
        });



    }

    private void populateDisease() {



   disData.add(new dis_data("Acne :" +
                "","Natural Remedy: " +
                "1. Apply Apple Cider Vinegar. Apple cider vinegar is made by fermenting apple cider, or the unfiltered juice from pressed apples.\n" +
           "Like other vinegars, it is known for its ability to fight many types of bacteria and viruses. Apple cider vinegar contains several organic acids that have been shown to kill P. acnes.\n" +
           "\n" +
           "2. Take a Zinc Supplement. Zinc is an essential nutrient that's important for cell growth, hormone production, metabolism and immune function. It is also one of the most studied natural treatments for acne. Research shows that people with acne tend to have lower levels of zinc in their blood than those with clear skin. Several studies have shown that taking zinc orally helps reduce acne.\n" +
           "\n" +
           "3. Make a Honey and Cinnamon Mask. Both honey and cinnamon are excellent sources of antioxidants. Studies have found applying antioxidants to the skin is more effective at reducing acne.\n" +
           "\n" +
           "4. Spot Treat With Tea Tree Oil. Tea tree oil is an essential oil that is extracted from the leaves of Melaleuca alternifolia, a small tree native to Australia. It is well known for its ability to fight bacteria and reduce skin inflammation.\n" +
           "\n" +
           "5. Apply Green Tea to Your Skin. Green tea is very high in antioxidants, and drinking it can promote good health. There aren't any studies exploring the benefits of drinking green tea when it comes to acne, but applying it directly to the skin has been shown to help. This is likely because the flavonoids and tannins in green tea are known to help fight bacteria and reduce inflammation, which are two main causes of acne.\n"));

   disData.add(new dis_data(" Nausea:" +
                "","Natural Remedy: " +
                "1. Ginger. Ginger has been used for thousands of years to help with nausea and diarrhea. Add some chopped, fresh ginger with lemon into hot water for a delicious way to beat nausea.\n" +
           "\n" +
           "2. Try Acupuncture or Acupressure. Acupuncture and acupressure are two techniques commonly used in traditional Chinese medicine to treat nausea and vomiting. During acupuncture, thin needles are inserted into specific points on the body. Acupressure aims to stimulate the same points of the body, but uses pressure instead of needles to do so. Both techniques stimulate nerve fibers, which transmit signals to the brain and spinal cord. These signals are thought to have the ability to decrease nausea. \n" +
           "\n" +
           "3. Slice a Lemon. Citrusy smells, such as those from a freshly sliced lemon, may help reduce nausea in pregnant women.\n" +
           "\n" +
           "4. Additional Tips to Reduce Nausea. \n" +
           "*Avoid spicy or fatty foods.\n" +
           "*Add protein to your meals.\n" +
           "*Avoid large meals.\n" +
           "*Avoid drinking with meals.\n"));

   disData.add(new dis_data(" Hiccups:" +
                "","Natural Remedy: " +
                "\n" +
           "1. Holding your breath.\n" +
           "\n" +
           "2. Drinking a glass of water quickly.\n" +
           "\n" +
           "3. Pulling hard on your tongue.\n" +
           "\n" +
           "4. Biting on a lemon.\n" +
           "\n" +
           "5. Breathing smelling salts.\n" +
           "\n" +
           "6. Apple cider vinegar. Apple cider vinegar has a lot of uses, but the sharp and sour flavor has been shown to get rid of hiccups.\n" +
           "\n" +
           "Other Simple Remedies:\n" +
           "1. Use duct tape to remove warts. \n" +
           "2. Cure nail fungus with vapor rub. \n" +
           "3. Soothe eczema by using oatmeal.\n" +
           "4. Cure bad breath by eating yogurt. \n" +
           "5. A spoonful of sugar to cure the hiccups.\n" +
           "6. Bite a pencil to cure a headache.\n" +
           "7. Eat olives to help with motion sickness.\n" +
           "*Common illnesses such as coughs and colds should not make you panic. There are a lot of home\n" +
           "remedies that would help you get rid of these illnesses without taking any over-the counter drugs."));




   disData.add(new dis_data("Stress:" +
                "","Natural Remedy: " +
                "\n" +
           "1. Try avoiding caffeine. Caffeine increases adrenaline in the body, which can cause stress, so avoid at all costs if you’re feeling tense.\n" +
           "\n" +
           "2. Make sleep a priority. Do what you can to make sure you're getting enough sleep to feel rested. If you aren't sleeping well, see your doctor.\n" +
           "\n" +
           "3. Use stress management and relaxation techniques. Visualization techniques, meditation and yoga are examples of relaxation techniques that can ease anxiety.\n" +
           "\n" +
           "4. Stay physically active. Develop a routine so that you're physically active most days of the week. Exercise is a powerful stress reducer. It may improve your mood and help you stay healthy. Start out slowly and gradually increase the amount and intensity of your activities.\n"));

   disData.add(new dis_data("Sore muscles:" +
                "","Natural Remedy: " +
                "1. Ice therapy. While a warm bath will give sore, over-worked muscles immediate relief, icing with crushed ice wrapped in a damp towel actually prevents further muscle damage and can speed up the muscle’s recovery process.\n" +
           "\n" +
           "2. Rest. Rest the affected area and discontinue the activity that caused the injury.\n" +
           "\n" +
           "3. Taking part in activities that encourage relaxation and reduce stress, such as yoga and meditation.\n" +
           "\n" +
           "4. Carefully stretching out the affected muscles."));

   disData.add(new dis_data("Joint pain or Arthritis :" +
                "","Natural Remedy: " +
                "\n" +
           "1. Turmeric is a bright yellow herb that has been used in Ayurvedic medicine across India and China for 2,000 years. Anecdotal evidence shows it’s useful in treating inflammation of the soft tissue in arthritis cases.\n" +
           "\n" +
           "2. Lose weight. Your weight can make a big impact on the amount of pain you experience from arthritis. Extra weight puts more pressure on your joints — especially your knees, hips, and feet.\n" +
           "Reducing the stress on your joints by losing weight will improve your mobility, decrease pain, and prevent future damage to your joints.\n" +
           "\n" +
           "3. Get more exercise. There are more benefits to exercise than just weight loss. Regular movement helps to maintain flexibility in your joints. Weight-bearing exercises such as running and walking can be damaging. Instead, try low-impact exercises such as water aerobics or swimming to flex your joints without adding further stress.\n" +
           "\n" +
           "4. Use hot and cold therapy. Simple hot and cold treatments can make a world of difference when it comes to arthritis pain. Long, warm showers or baths — especially in the morning — help ease stiffness in your joints. Use an electric blanket or moist heating pad at night to keep your joints loose.Cold treatments are best for relieving joint pain, swelling, and inflammation. Wrap a gel ice pack or a bag of frozen vegetables in a towel and apply it to painful joints for quick relief.\n"));

   disData.add(new dis_data("Urinary tract infection:" +
                "","Natural Remedy: " +
                "1. Drink Plenty of Fluids. This is because regular urination can help flush bacteria from the urinary tract to prevent infection.\n" +
           "\n" +
           "2. Increase Vitamin C Intake. Some evidence shows that increasing your intake of vitamin C could protect against urinary tract infections. Vitamin C is thought to work by increasing the acidity of the urine, thereby killing off the bacteria that cause infection.\n" +
           "\n" +
           "3. Drink Unsweetened Cranberry Juice. Drinking unsweetened cranberry juice is one of the most well-known natural remedies for urinary tract infections. Cranberries work by preventing bacteria from adhering to the urinary tract, thus preventing infection.\n" +
           "\n" +
           "4. Take a Probiotic. Probiotics are beneficial microorganisms that are consumed through food or supplements. They can promote a healthy balance of bacteria in your gut.\n"));

   disData.add(new dis_data("" +
                "","Natural Remedy: " +
                "1. Drink Plenty of Fluids. This is because regular urination can help flush bacteria from the urinary tract to prevent infection.\n" +
           "\n" +
           "2. Increase Vitamin C Intake. Some evidence shows that increasing your intake of vitamin C could protect against urinary tract infections. Vitamin C is thought to work by increasing the acidity of the urine, thereby killing off the bacteria that cause infection.\n" +
           "\n" +
           "3. Drink Unsweetened Cranberry Juice. Drinking unsweetened cranberry juice is one of the most well-known natural remedies for urinary tract infections. Cranberries work by preventing bacteria from adhering to the urinary tract, thus preventing infection.\n" +
           "\n" +
           "4. Take a Probiotic. Probiotics are beneficial microorganisms that are consumed through food or supplements. They can promote a healthy balance of bacteria in your gut.\n"));


       disData.add(new dis_data("Common Cold:" +
                "","Natural Remedy: " +
                "1. Garlic soup helps reduce the harshness of a cold.\n" +
               "\n" +
               "2. A glass of lemon juice a day would raise the body’s resistance.\n" +
               "\n" +
               "3. Onion juice can also help avoid a cold.\n" +
               "\n" +
               "4.Drink plenty of water, at least 6-8 glasses per day."));

       disData.add(new dis_data(" Cough :" +
                "","Natural Remedy: " +
                "1.Basil leaves and ginger are very effective in relieving an irritating dry cough. You can either chew basil leaves or take fresh ginger with hot water.\n" +
               "2. Eat grapes. Grapes when eaten regularly can also help get rid of severe coughs. \n" +
               "3. Drinking a few cups of hot water with salt can also help stop coughing.\n" +
               "4. Take a hot shower. Breathing in the steam can provide temporary relief.\n" +
               "5. Licorice root tea is a traditional treatment for cough, though studies have shown mixed results as to whether it works."));

       disData.add(new dis_data("Common Fever:" +
                "","Natural Remedy: " +
                "1.Drink tea made with from saffron.\n" +
               "2. Eat oranges. Oranges give instant energy and helps the body fight unwanted infections.\n" +
               "3. A glass of milk also works wonders.\n"));

       disData.add(new dis_data("Fever Blisters:" +
                "","Natural Remedy: " +
                "1. Apply petroleum jelly to the skin.\n" +
               "2. Apply cold compress on the affected area.\n" +
               "3. Avoid eating nuts and chocolate."));

       disData.add(new dis_data("Headache :" +
                "","Natural Remedy: " +
                "1. Drink water. Inadequate hydration may lead you to develop a headache.\n" +
               "\n" +
               "2.Take Some Magnesium. Magnesium has also been shown to be a safe, effective remedy for headaches. \n" +
               "\n" +
               "3.Drink Caffeinated Tea or Coffee. Caffeine improves mood, increases alertness and constricts blood vessels, all of which can have a positive effect on headache symptoms.\n" +
               "\n" +
               "4.Peppermint oil is often applied to the skin to help relieve a headache. When it’s applied to the skin, peppermint oil can cause surface warmth, which relieves pain beneath the skin.\n" +
               "\n" +
               "5.Acupuncture is a technique of Traditional Chinese medicine that involves inserting thin needles into the skin to stimulate specific points on the body.This practice has been linked to a reduction in headache symptoms in many studies."));

       disData.add(new dis_data("Sore Throat" +
                "","Natural Remedy: " +
                "1. A mixture of Listerine mouth wash and Hydrogen Peroxide. Pour a little of each liquid into a cup\n" +
               "(equal parts) and gargle.\n" +
               "2. Eat three to four marshmallows to soothe a sore throat. The gelatin in the marshmallows is what\n" +
               "soothes the sore throat. \n" +
               "3. Drink hot water, lemon juice, and honey mixed together."));

       disData.add(new dis_data("Heartburn" +
                "","Natural Remedy: " +
                "1. Dissolve a tsp. of baking soda in 8 ounces (1 cup) of water and drink. Baking soda is a natural\n" +
               "antacid.\n" +
               "2. Bananas act as a natural antacid in the body. You can eat either fresh or dried bananas.\n" +
               "3. Fresh ginger is one of the oldest remedies for heartburn. It can be added to food when its cooked, eaten raw, or consumed as ginger tea."));

       disData.add(new dis_data("" +
                "","Natural Remedy: " +
                ""));

disData.add(new dis_data(" PMS: " +
                "","Natural Remedy: " +
                "\n" +
        "1.Magnesium is key in easing PMS symptoms for many women. It helps calm and relax the body, which helps with cramps. Look to foods like almonds, sunflower seeds, and greens like spinach and broccoli, for a natural dose of magnesium.\n" +
        "\n" +
        "2. Add Omega-3 fats to your diet. Research shows that adding omega-3 fatty acids to your diet reduces common PMS symptoms. The best thing to do is to eat plenty of wild salmon.\n" +
        "\n" +
        "3. Exercise regularly. Getting out and getting moving will increase your circulation, elevate your mood, and help you sweat out some of that bloat."));

disData.add(new dis_data(" Indigestion" +
                "","Natural Remedy: " +
                "1. Peppermint, peppermint tea, and peppermint oil are essential for relieving stomach issues like indigestion, nausea, gas, and cramps.\n" +
        "\n" +
        "2. Chamomile tea can ease gut discomfort and relieve indigestion by reducing stomach acid in the gastrointestinal tract. It also acts as anti-inflammatory to stop pain.\n" +
        "\n" +
        "3. Apple cider vinegar helps to increase your body’s production of stomach acid as too little stomach acid can trigger indigestion.\n" +
        "\n" +
        "4. Ginger is another natural remedy for indigestion because it can reduce stomach acid. The same way too little stomach acid causes indigestion, too much stomach acid has the same effect.\n" +
        " "));

disData.add(new dis_data("10. Bad breath:" +
                "","Natural Remedy: " +
                "\n" +
        "1. Oil pulling. Simply swish around a table spoon of coconut oil in your mouth for 20 minutes each day before cleaning your teeth.\n" +
        "\n" +
        "2. Cure bad breath by eating yogurt.\n" +
        "\n" +
        "3. Drink water as dry mouth is a condition that can cause halitosis as well as other oral health problems.\n" +
        "\n" +
        "4. Cinnamon oil shows powerful antibacterial effects. Adding cinnamon oil for oral hygiene might help to control halitosis (bad breath)."));

disData.add(new dis_data(" Anxiety :" +
                "","Natural Remedy: " +
                "1. Meditation. If you suffer from anxiety, it could pay off to try meditation before you start popping pills. Chronic stress has been linked to people with increased risk of Heart Disease, weight gain, sleep problems, and memory and concentration impairment. In studies, daily meditation has also been proven to help manage the symptoms of anxiety disorders, sleep disorders, depression, heart disease, and cancer. Meditation actually works, so you should try it.\n" +
        "\n" +
        "2. Stay active. Regular exercise is good for your physical and emotional health. Regular exercise works to ease anxiety for some people.\n" +
        "\n" +
        "3. Don’t drink alcohol. Alcohol is a natural sedative. Drinking a glass of wine or a finger of whiskey when your nerves are shot may calm you at first. Once the buzz is over, however, anxiety may return with a vengeance.\n" +
        "\n" +
        "4. Ditch caffeine. If you have chronic anxiety, caffeine is not your friend. Caffeine may cause nervousness and jitters, neither of which is good if you’re anxious. Research has shown caffeine may cause or worsen anxiety disorders.\n" +
        "\n" +
        "5. Eat a healthy diet. Low blood sugar levels, dehydration, or chemicals in processed foods such as artificial flavorings, artificial colorings, and preservatives may cause mood changes in some people. A high-sugar diet may also impact temperament. If your anxiety worsens after eating, check your eating habits. Stay hydrated, eliminate processed foods, and eat a healthy diet rich in complex carbohydrates, fruits and vegetables, and lean proteins."));

disData.add(new dis_data(" Weight loss :" +
                "","Natural Remedy: " +
                "1. Add Protein to Your Diet. When it comes to weight loss, protein is the king of nutrients. Your body burns calories when digesting and metabolizing the protein you eat, so a high-protein diet can boost metabolism by up to 80-100 calories per day. A high-protein diet can also make you feel more full and reduce your appetite.\n" +
        "\n" +
        "2. Eat Whole, Single-Ingredient Foods. One of the best things you can do to become healthier is to base your diet on whole, single-ingredient foods.\n" +
        "By doing this, you eliminate the vast majority of added sugar, added fat and processed food.\n" +
        "\n" +
        "3. Avoid Processed Foods. They are usually high in added sugars, added fats and calories.\n" +
        "\n" +
        "4. Limit Your Intake of Added Sugar. Eating a lot of added sugar is linked with some of the world's leading diseases, including heart disease, type 2 diabetes and cancer. Minimizing your intake of added sugar is a great way to improve your diet.\n" +
        "\n" +
        "5. Drink Water. There is actually truth to the claim that drinking water can help with weight loss."));

adapter.notifyDataSetChanged();





    }


    public void filterList(String s){

        ArrayList<dis_data> temD=new ArrayList<>();
        for(dis_data d: disData){
            if(d.getDisname().toLowerCase().contains(s.toLowerCase())){
                temD.add(d);
            }
        }

       rv.setAdapter(new disAdapter(temD));

    }
}
