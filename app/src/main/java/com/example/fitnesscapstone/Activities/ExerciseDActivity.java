package com.example.fitnesscapstone.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.fitnesscapstone.Adapters.ExerciseDisplayAdapter;
import com.example.fitnesscapstone.R;
import com.example.fitnesscapstone.dataModels.xdact_data;

import java.util.ArrayList;

public class ExerciseDActivity extends AppCompatActivity {

    RecyclerView r1,r2,r3,r4,r5,r6,r7;

    ArrayList<xdact_data> chestD=new ArrayList<>();
    ArrayList<xdact_data> BicepsD=new ArrayList<>();
    ArrayList<xdact_data> TricepsD=new ArrayList<>();
    ArrayList<xdact_data> ShoulderD=new ArrayList<>();
    ArrayList<xdact_data> BackD=new ArrayList<>();
    ArrayList<xdact_data> LegsD=new ArrayList<>();
    ArrayList<xdact_data> AbsD=new ArrayList<>();

    ExerciseDisplayAdapter adapter1,ad2,ad3,ad4,ad5,ad6,ad7;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise_d);

        r1=(RecyclerView)findViewById(R.id.xdact_rv1);
        r2=(RecyclerView)findViewById(R.id.xdact_rv2);
        r3=(RecyclerView)findViewById(R.id.xdact_rv3);
        r4=(RecyclerView)findViewById(R.id.xdact_rv4);
        r5=(RecyclerView)findViewById(R.id.xdact_rv5);
        r6=(RecyclerView)findViewById(R.id.xdact_rv6);
        r7=(RecyclerView)findViewById(R.id.xdact_rv7);

        r1.setLayoutManager(new LinearLayoutManager(this));
        r2.setLayoutManager(new LinearLayoutManager(this));
        r3.setLayoutManager(new LinearLayoutManager(this));
        r4.setLayoutManager(new LinearLayoutManager(this));
        r5.setLayoutManager(new LinearLayoutManager(this));
        r6.setLayoutManager(new LinearLayoutManager(this));
        r7.setLayoutManager(new LinearLayoutManager(this));


        setData();


    }

    public void setData(){
        chestD.add(new xdact_data("Barbell Bench Press",
                "You can generate the most power with barbell lifts, so the standard barbell bench allows you to move the most weight.\n" +
                        "It's also an easier lift to control than pressing with heavy dumbbells.\n" +
                        "The exercise is easy to spot and relatively easy to learn (if not master), There are plenty of bench-press programs you can follow to increase your strength.\n" +
                        "\n" +
                        "How: Lie on a flat bench holding a barbell with your hands slightly wider than shoulder-width apart.\n" +
                        "Brace your core, then lower the bar towards your chest. Press it back up to the start.\n" +
                        "\n" +
                        "How much: 5 sets * 5 reps :  Rest -> 60 secs",
                R.drawable.barbellbpress));


        chestD.add(new xdact_data("Incline Barbell Bench Press",
                "Many benches are fixed at a very steep angle, which requires a larger contribution from the front delts than the chest to move the weight. \n" +
                        "If possible, go for a less-steep incline to hit the upper pecs without as much stress on the delts. \n" +
                        "You can also easily do low-incline benches with an adjustable bench on the Smith machine. If you're really looking to build that shelf of an upper chest,\n" +
                        "EMG results have suggested that bringing your grip in a bit closer may hammer upper-chest fibers significantly more. \n" +
                        "\n" +
                        "How : Lie on an incline bench holding a barbell with your hands slightly wider than shoulder-width apart.\n" +
                        "Brace your core, then lower the bar towards your chest. Press it back up to the start.\n" +
                        "\n" +
                        "How much: 5 sets * 5 reps : Rest -> 60 secs",
                R.drawable.barbellincline));

          chestD.add(new xdact_data("Flat Bench Dumbbell Press",
                "With dumbbells, each side of your body must work independently, which recruits more stabilizer muscles; dumbbells are harder to control than a barbell.\n" +
                        "Dumbbells also allow for a longer range of motion than the barbell bench press, both at the bottom and top of the movement. \n" +
                        "Flat dumbbell presses allow you to hoist a fairly heavy weight, and they make for a good alternative if you've been stuck on the barbell bench for ages.\n" +
                        "\n" +
                        "How:  Lie on a flat bench holding the dumbbells with your hands slightly wider than shoulder-width apart.\n" +
                        "Brace your core, then lower the bar towards your chest. Press it back up to the start.\n" +
                        "\n" +
                        "How much: 4 sets * 8 reps : Rest -> 40 secs",
                R.drawable.dumbellbenchpress));


          chestD.add(new xdact_data("Incline Dumbbell Press",
                "Dumbbell presses make everybody's top 10 list, but with an adjustable bench you can do a number of things you can't with a fixed bench.\n" +
                        "Our favorite: changing the angle of the incline from one set to the next, or from one workout to the next. Hitting a muscle from varying degrees of \n" +
                        "incline angles builds it more thoroughly.\n" +
                        "\n" +
                        "How: Lie on an incline bench holding a dumbbell in each hand by your shoulders. Brace your core,\n" +
                        "then press the weights up until your arms are straight. Lower them back to the start.\n" +
                        "\n" +
                        "How much: 4 sets * 8 reps : Rest -> 40 secs",
               R.drawable.dumbellinclinepress ));


          chestD.add(new xdact_data("Cable fly",
                "Give your pectorals and deltoids a new stimulus instead of pressing.\n" +
                        "Add the cable fly to your chest day to provide constant tension throughout the full movement.\n" +
                        "\n" +
                        "How: Attach stirrup handles to the high pulleys of a cable crossover machine. Take one in each hand – your arms should be outstretched with a slight bend.\n" +
                        "Place one foot slightly forward, brace your core, and pull the handles downward and across your body. Return to the start position under control.\n" +
                        "\n" +
                        "How much: 4 sets * 10 reps : Rest -> 40 secs",
               R.drawable.cablefly ));


          chestD.add(new xdact_data("Incline Dumbbell Fly",
                "The incline dumbbell fly is a great chest exercise which targets the pectoralis major and minor which puts great emphasis on the upper chest.\n" +
                        "It’s a popular variation of the chest fly and really stretches the chest muscles while allowing for a full range of motion through the movement.\n" +
                        "But good form must be practiced at all times because the position of the exercise can potentially compromise shoulder safety.\n" +
                        "\n" +
                        "How: Sit on an incline bench holding dumbbells on your thighs. Kick the dumbbells back and lie down on the bench with feet flat on the floor.\n" +
                        "Position your arms outward in a wide position with a neutral grip and slightly bend your elbows. Bring the dumbbells together while internally\n" +
                        "rotating your shoulders and contracting your chest with arms extended. Hold for a couple of seconds while squeezing the chest muscles.\n" +
                        "Slowly lower back down until you feel a slight stretch in the chest muscles.\n" +
                        "\n" +
                        "How much: 4 sets * 8 reps : Rest -> 40 secs",
                R.drawable.dumbbellinclinefly));


          chestD.add(new xdact_data("Push ups",
                "It's all about what happens on the back of your body. In all of these bench presses, \"good form\" demands that your shoulder blades remain pinned to the\n" +
                        "bench throughout the movement. This can make for a stronger, safer bench, but it doesn't promote proper shoulder function at the end of the day.\n" +
                        "Your scapulae are designed to move, not just retract. You need to train both actions!\n" +
                        "Enter the push-up, which allows for free mobility of the scapulae. When done right, with your shoulder blades separating and protracting at the top,\n" +
                        "the push-up is one of the best activators of the serratus anterior muscles.\n" +
                        "\n" +
                        "How: Thinking about a push-up as a moving plank is actually really helpful. The correct setup for a standard push-up is to position your hands\n" +
                        "shoulder-width apart, or a little bit wider. As you bend your elbows and lower toward the ground, your elbows should be at about a 45-degree\n" +
                        "angle to your body.\n" +
                        "\n" +
                        "How much : 3 sets * 12 reps : Rest : 60 secs",
                R.drawable.pushups));

          adapter1=new ExerciseDisplayAdapter(chestD);
          r1.setAdapter(adapter1);




          //biceps

        BicepsD.add(new xdact_data("Regular-Grip Barbell Curl",
                "\n" +
                        "This is as basic as it gets. You've probably heard serious lifters carrying on about oblivious meatheads taking up space in squat racks to do\n" +
                        "bicep curls, so be mindful when and where you load up a barbell  but that shouldn't be an excuse to skip out on the move entirely.\n" +
                        "Barbells allow you to work both arms simultaneously and evenly, and the position of your grip can allow you to home in on different parts of the muscle.\n" +
                        "\n" +
                        "How: Grab the barbell with an underhand grip, with your your hands positioned about as wide as your hips. To emphasize the inner portion of the bicep,\n" +
                        "take a wider grip; to target the outer part of the muscle, bring your hands closer together. Start holding the bar at hip height, then squeeze your core and\n" +
                        "contract your biceps to curl the bar up to shoulder height. Squeeze your biceps at the top of the movement, then slowly lower the weight back to the\n" +
                        "starting position, controlling the weight through the eccentric movement.\n" +
                        "\n" +
                        "How much: 3 sets * 10 reps : Rest -> 40 secs",
                R.drawable.barbellcurl));


 BicepsD.add(new xdact_data("Dumbbell Biceps Curl",
                "Dumbbells allow the wrists to move freely, so most people adopt for a slight rotation of the wrist and forearm as they curl, which thickens the \n" +
                        "muscle group. But we would ask that you use a weight that makes sense: If you’re swaying back wildly and contorting your body—especially\n" +
                        "excessively arching your lower back—to lift the load, you should probably get a lighter pair of dumbbells.\n" +
                        "\n" +
                        "How:  Grab a pair of dumbbells and let them hang at arm’s length next to your sides. Turn your arms so your palms face forward.\n" +
                        "Without moving your upper arms, bend your elbows and curl the dumbbells as close to your shoulders as you can. Pause, then\n" +
                        "slowly lower the weight back to the starting position. Each time you return to the starting position, completely straighten your arms.\n" +
                        "\n" +
                        "How much : 4 sets * 10 reps : Rest -> 40 secs",
                R.drawable.dumbellcurl));


 BicepsD.add(new xdact_data("Hammer curl",
                "\n" +
                        "The hammer will typically be our strongest curl during a biceps workout. This is because all of our elbow flexors are actively involved,\n" +
                        "and the forearm and wrist are in a power position. Doing this movement like a concentration curl or preacher curl (on a preacher bench)\n" +
                        "will minimize cheating and maximize muscle recruitment during the workout.\n" +
                        "\n" +
                        "How: Grab a pair of dumbbells and let them hang at arm’s length next to your sides with your palms facing your thighs.\n" +
                        "Without moving your upper arms, bend your elbows and curl the dumbbells as close to your shoulders as you can.\n" +
                        "Pause, then slowly lower the weight back to the starting position.\n" +
                        "\n" +
                        "How much: 4 sets * 10 reps : Rest -> 50 secs",
                R.drawable.hammer));


 BicepsD.add(new xdact_data("Decline Dumbell Curl",
                "Lying chest-down on a bench really isolates the biceps since you don’t have to maintain as much tension in your\n" +
                        "legs and core muscles as you do when you stand. Use various grips in this position to zero in on different parts of your biceps.\n" +
                        "\n" +
                        "How: Grab a pair of dumbbells and lie with your chest against a bench that’s set to a 45-degree incline.\n" +
                        "Without moving your upper arms, bend your elbows and curl the dumbbells as close to your shoulders as you can. Pause,\n" +
                        "then slowly lower the weight back to the starting position. Each time you return to the starting position, completely straighten your arms.\n" +
                        " \n" +
                        "How much: 4 sets * 8 reps : Rest -> 40 secs",
                R.drawable.dumbelldecline));


 BicepsD.add(new xdact_data(" Incline Inner-Biceps Curl",
                "This exercise also stretches the long head of the biceps. The more horizontal the bench during your workout, the more the long head of the\n" +
                        "muscle will be stretched during reps. This puts an extra challenge on the long head of your biceps brachii because you’re working from a \n" +
                        "deficit — meaning, you’re starting the movement at a point where you have less leverage than normal.\n" +
                        "\n" +
                        "How: Grab a pair of dumbbells and lie with your back against a bench that’s set to a 45-degree incline. Without moving your upper arms,\n" +
                        "bend your elbows and curl the dumbbells as close to your shoulders as you can. Pause, then slowly lower the weight back to the starting\n" +
                        "position. Each time you return to the starting position, completely straighten your arms.\n" +
                        "\n" +
                        "How much: 4 sets * 8 reps : Rest -> 40 secs",
                R.drawable.inclineinnerbiceps));


 BicepsD.add(new xdact_data(" Zottman Curl",
                "In this movement, you hold a dumbbell in each hand and have a palms-up (supinated) grip on the way up and a palms-down (pronated) grip\n" +
                        "as you lower the weight, so all of your elbow flexors get hit! Some of your elbow flexors act as supinators as well, so rotating the wrist and\n" +
                        "forearm during the curl instead of at the bottom will load up that function. These are awesome to add into your isolation workout because\n" +
                        "they truly isolate the biceps muscle! This exercise targets the three major muscles that make up the biceps—the biceps brachii, brachialis,\n" +
                        "and brachioradialis—by rotating from an underhand to an overhand grip halfway through the move.\n" +
                        "\n" +
                        "\n" +
                        "How: Grab a pair of dumbbells and let them hang at arm’s length next to your sides. Turn your arms so your palms face forward.\n" +
                        " Without moving your upper arms, bend your elbows and curl the dumbbells as close to your shoulders as you can. Pause, then\n" +
                        " rotate the dumbbells so your palms face forward again. Slowly lower the weights down in that position. Rotate the dumbbells\n" +
                        " back to the starting position and repeat.\n" +
                        "\n" +
                        "How much: 3 sets * 8 reps : Rest -> 40 secs",
               R.drawable.zottmancurl ));


 ad2=new ExerciseDisplayAdapter(BicepsD);
 r2.setAdapter(ad2);

 //triceps


        TricepsD.add(new xdact_data("Close-grip Bench Press",
                " \n" +
                        "The bench press is a great tricep exercise to work your chest and core. Placing your hands closer together\n" +
                        " makes it so your triceps have to work harder, which can lead to new growth and more strength.\n" +
                        "\n" +
                        "How: Grasp a barbell with an overhand grip that’s shoulder-width apart, and hold it above your sternum with arms completely\n" +
                        "straight. Lower the bar straight down, pause, and then press the bar back up to the starting position.\n" +
                        "\n" +
                        "How much: 3 sets * 8 reps : Rest -> 40 secs",
                R.drawable.closegripbenchpress));


        TricepsD.add(new xdact_data(" Rope Tricep Pushdown",
                " \n" +
                        "This move zones in on your triceps – but only if you do it right. If you use too much weight, you’ll involve your back\n" +
                        " and shoulder muscles, defeating the purpose. If you can’t keep your shoulders down, lighten the load.\n" +
                        "\n" +
                        "How: Attach a rope handle to the high pulley of a cable station. Bend your arms and grab the bar with an overhand grip,\n" +
                        "your hands shoulder-width apart. Tuck your upper arms next to your sides. Without moving your upper arms, push the bar\n" +
                        "down until your elbows are locked. Slowly return to the starting position.\n" +
                        "\n" +
                        "How much: 4 sets * 10 reps : Rest -> 40 secs\n",
                R.drawable.ropepushdown));




        TricepsD.add(new xdact_data("Overhead Triceps Extension",
                "When you work your triceps, you might forget there are three parts to the muscle: the lateral head, the medial head, and the long head.\n" +
                        "The last part might not always get the attention it deserves – unless you're regularly doing exercises like this one, with your arms \n" +
                        "over your head to isolate the long head.\n" +
                        "\n" +
                        "How: Sit on a bench and grab one dumbbell. Form a diamond shape with both hands to grip the top end of the weight.\n" +
                        "Raise the dumbbell over your head, keeping your elbows up and your core tight. Lower the dumbbell down the top of\n" +
                        "your back by bending at the elbow, maintaining your strong chest and keeping your shoulders still. Raise the weight by\n" +
                        "fully extending your arms, pausing for a count to squeeze at the top of the movement.\n" +
                        "\n" +
                        "How much: 4 sets * 8 reps : Rest -> 50 secs ",
                R.drawable.tricepoverheadexten));


        TricepsD.add(new xdact_data("Skullcrushers (Lying Triceps Extensions)",
                " \n" +
                        "Whilst there are many variations of this move, they all have one thing in common: elbow extension. As the upper arms are \n" +
                        "locked in position, the long and lateral tricep heads are called into play. Increasing the angle of an incline bench will work your \n" +
                        "triceps long head, while doing the movement on a decline bench places more emphasis on the lateral triceps head.\n" +
                        "\n" +
                        "How: Grip the EZ bar on the inner grips using an overhand grip and extend your arms straight up. Keeping your elbows fixed and \n" +
                        "tucked in, slowly lower the bar until it is about an inch from your forehead. Always keep your upper arms perpendicular to the floor.\n" +
                        "Slowly extend your arms back to the starting position without locking your elbows.\n" +
                        "\n" +
                        "How much: 4 sets * 8 reps : Rest -> 50 secs",
               R.drawable.skullcrushers ));


        TricepsD.add(new xdact_data("Tricep Dips",
                " Because you’re lifting your entire bodyweight, your triceps have to work against a much heavier load than they would in a \n" +
                        "triceps-isolating exercise.\n" +
                        "\n" +
                        "How: Hoist yourself up on parallel bars with your torso perpendicular to the floor; you'll maintain this posture \n" +
                        "throughout the exercise. (Leaning forward will shift emphasis to your chest and shoulders.) Bend your knees and cross your \n" +
                        "ankles. Slowly lower your body until your shoulder joints are below your elbows. Push back up until your elbows are nearly \n" +
                        "straight but not locked. If you have shoulder issues, skip this move.\n" +
                        "\n" +
                        "How much: 4 sets * 8 reps : Rest -> 60 secs",
                R.drawable.tricepdips));


  TricepsD.add(new xdact_data("Diamond Press-up",
                " \n" +
                        "It doesn't get any more basic than this tricep exercise. The standard press-up is great for your chest and arms, but moving\n" +
                        "your hands closer together puts the emphasis squarely on your triceps. You're still going to get some work for your pecs with\n" +
                        "this variation, but your tris should really feel the burn by the time you're through.\n" +
                        "\n" +
                        "How:  Lower yourself down into a standard plank or press-up position. Bring your hands close to each other at chest level, \n" +
                        "with your thumbs touching one another and your forefingers touching. Your spine should be straight, and your core and \n" +
                        "glutes should be squeezed tight. Lower yourself down to the floor. Pause, maintaining the squeeze in your core and glutes,\n" +
                        "then push back up to the original position by straightening your arms.\n" +
                        "\n" +
                        "How much: 4 sets * 10 reps : Rest -> 50 secs",
                R.drawable.diamondpress));


  ad3=new ExerciseDisplayAdapter(TricepsD);
  r3.setAdapter(ad3);


  //shoulders

        ShoulderD.add(new xdact_data("Barbell Overhead Press",
                "This is your big compound move to get things going. Start with a warm-up set that focuses on time under tension\n" +
                        " (i.e., the amount of time you spend moving the weight), aiming for four seconds lowering with a two second blast\n" +
                        " upward, to strengthen your shoulders for the workout ahead.\n" +
                        "\n" +
                        "How: Stand with your feet shoulder-width apart with your core set tight and a barbell held at your shoulders,\n" +
                        " palms facing forwards. From here, tense and drive the bar upward, really squeezing your shoulder blades together\n" +
                        " at the top of the movement. Lower with control.\n" +
                        "\n" +
                        "How much: 4 sets * 10 reps : Rest -> 50 secs",
                R.drawable.barbelloverheadpress));

  ShoulderD.add(new xdact_data("Dumbbell Lateral Raise",
                "Lateral raises hit the middle of your deltoid, an area often missed and therefore underdeveloped for a lot of people. \n" +
                        "Don’t get hung up on form here. Keep your back and body in the right position but if you can really push yourself, \n" +
                        "creating a little swing for the final three is fine. Obviously if there’s pressure on the lower back, stop.\n" +
                        "\n" +
                        "How: Either stand with a pair of dumbbells at your sides or set up a cable machine so the handles are at the lowest\n" +
                        "points, grabbing the left handle with your right hand and vice versa. Set your feet at shoulder width, pivot forward slightly \n" +
                        "at the hips, engage your core and pull your shoulder blades together to lift the weights out to your sides. Lower with control.\n" +
                        "\n" +
                        "How much: 4 sets * 12 reps : Rest -> 60 secs",
                R.drawable.dumbelllateralraise));

  ShoulderD.add(new xdact_data("Pec Deck Rear Fly",
                "This really isolates the rear of your deltoids, so you won’t need to go too heavy here. Using the pec dec machine ensures\n" +
                        " there’s constant resistance during both the eccentric and concentric part of the movement, which equals more muscle building bang for your buck.\n" +
                        "\n" +
                        "How: Set the seat so the handles are at shoulder level, which in turn should be sat fully to the rear of the machine’s settings. \n" +
                        "Hold the handles with your palms facing inwards. From here, set your torso tight and draw your arms out to the side and back through \n" +
                        "the dec’s semicircular plane. Return with control.\n" +
                        "\n" +
                        "How much: 4 sets * 12 reps : Rest -> 50 secs",
                R.drawable.pekdekrearfly));

  ShoulderD.add(new xdact_data("Reverse Cable Crossover",
                "\n" +
                        "Time to hit the front of the deltoids with some serious time under tension. The focus here is steady, sweat-inducing control. \n" +
                        "Don’t use a weight that you can’t move slowly for 10 reps. And resist the urge to let the cables swing back with speed. You want tension the whole time.\n" +
                        "\n" +
                        "How: Stand in between the cable machines, with the handles set at the highest points. As with the cable lateral raise, \n" +
                        "grab the handles in the opposite hands, but this time draw them to your chest so your arms are crossed a bit like Wolverine. \n" +
                        "Lean forward slightly and draw your arms out and down. Again, a bit like Wolverine but in his full, claws-out extension. \n" +
                        "\n" +
                        "How much: 4 sets * 12 reps : Rest -> 50 secs",
                R.drawable.reversecable));

  ShoulderD.add(new xdact_data("Front Raise",
                "This pretty painful move targets the front delts and doesn’t let up. It’s imperative you pick a reasonable weight here, because overdoing it \n" +
                        "will put all the onus on your lower back and very little of it on your delts. You want big shoulders, not a month off work due to muscle spasms.\n" +
                        "\n" +
                        "How: Holding either a weight plate or barbell, set your hands at hip height. With your feet at shoulder width and your core tensed, \n" +
                        "draw your shoulder blades back and raise the weight with straight arms up to shoulder level. Keep breathing. Lower with control.\n" +
                        "\n" +
                        "How much: 4 sets * 15 reps : Rest -> 50 secs",
               R.drawable.frontraise ));

  ShoulderD.add(new xdact_data("Dumbbell Shrugs",
                "\n" +
                        "Now for the finishing move: shrugging metal upwards to build a set of Tom Hardy-esque traps. You can go quite heavy here, as \n" +
                        "you’re not moving the dumbbells through a particularly challenging range of motion. But be sure to reduce the weight if you end up \n" +
                        "compensating with your arms or calves.\n" +
                        "\n" +
                        "How: Standing with your feet planted shoulder-width apart, bend your knees to pick up the two dumbbells, letting them come to rest on your quads. \n" +
                        "It’s all about mind-muscle connection here. Really think of your traps squeezing as you draw your shoulders together to raise the weights. Keep your\n" +
                        "arms loose and as inactive as possible. Lower with control.\n" +
                        "\n" +
                        "How much: 4 sets * 12 reps : Rest -> 60 secs",
                R.drawable.dumbellshrug));

  ShoulderD.add(new xdact_data(" Trap Raise",
                "\n" +
                        "How: Set a bench to a low incline and lie chest-down with a dumbbell in each hand and your palms facing. \n" +
                        "Retract your shoulder blades, then raise the weights straight out so your arms are parallel to the floor.\n" +
                        "\n" +
                        "How much: 4 sets * 10 reps : Rest -> 60 secs",
               R.drawable.trapraise ));

  ad3=new ExerciseDisplayAdapter(ShoulderD);
  r3.setAdapter(ad3);


  //Back

  BackD.add(new xdact_data("Lat Pulldown",
          "While you can't beat the chinup as a back exercise, the lat pulldown is also great for increasing muscle. In fact, bodybuilders swear by it. \n" +
                  "Get the most out of the move by performing the exercise at a slow, controlled tempo. You should \"feel\" your lats working each rep. \n" +
                  "Do 8 to 12 reps like this, making sure your upper body remains in nearly the same position from start to finish.\n" +
                  "\n" +
                  "How: Sit down at a lat pulldown station and grab the bar with an overhand grip that's just beyond shoulder width. \n" +
                  "Without moving your torso, pull your shoulders back and down, and bring the bar down to your chest. Pause, then slowly return to the starting position.\n" +
                  "\n" +
                  "How much: 3 sets * 12 reps : Rest -> 50 secs",
          R.drawable.latpulldown))  ;

BackD.add(new xdact_data("Barbell Deadlift",
          "This is technically more than a back exercise—it hits the entire posterior chain from your calves to your upper traps—but it's the absolute best for overall backside \n" +
                  "development. Technique is uber-important with the deadlift, but once you nail it, you can progress to lifting monster weights that will recruit maximum \n" +
                  "muscle, release muscle-building hormones, and help you get big.\n" +
                  "\n" +
                  "How: Load a barbell and roll it against your shins. Bend at your hips and knees and grab the bar with an overhand grip, your hands just beyond shoulder width. \n" +
                  "Keeping your lower back naturally arched, pull your torso up and thrust your hips forward as you stand up with the barbell. Lower the bar to the floor \n" +
                  "and repeat.\n" +
                  "\n" +
                  "How much: 4 sets * 8 reps : Rest -> 60 secs",
          R.drawable.barbelldeadlift))  ;

BackD.add(new xdact_data(" Seated Cable Row",
          "\n" +
                  "Seated cable rows are a traditional upper-back exercise. Adding a pause for three seconds when the bar gets to your torso, however, can increase your gains. \n" +
                  "The pause keeps your scapular retractors working longer. Strengthening these muscles is important because a weakness can lead to unstable shoulders—\n" +
                  "and that limits your strength and muscle gains in nearly every upper-body exercise, including the bench press and arm curl.\n" +
                  "\n" +
                  "How: Attach a straight bar to a cable station and position yourself with your feet braced. Grab the bar using an overhand, shoulder-width grip, and sit upright. \n" +
                  "Pull the bar to your upper abs. Pause for three seconds, then slowly lower your body back to the starting position. Your torso should remain straight and \n" +
                  "motionless throughout the movement. Don't lean forward and backward to perform the exercise.\n" +
                  "\n" +
                  "How much: 4 sets * 10 reps : Rest -> 50 secs",
          R.drawable.seatedcable))  ;

BackD.add(new xdact_data("Bent-Over Barbell Row",
          "This is probably the second-best back movement in terms of sheer weight you can lift. EMG research has suggested that hitting bent-over barbell rows will \n" +
                  "work the larger muscle groups of the upper and lower back equally, making this a great overall back builder. Like the deadlift, this is another technical \n" +
                  "move that requires excellent form but rewards you with a ton of muscle.\n" +
                  "\n" +
                  "How: Grab a barbell with an overhand grip that’s just beyond shoulder width, and hold it at arm’s length. Lower your torso until it’s almost parallel\n" +
                  " to the floor, and bend at your hips and knees. Let the bar hang at arm’s length. Pull the bar to your upper abs as you squeeze your shoulder blades \n" +
                  "together. Pause, and slowly lower the bar back to the starting position.\n" +
                  "\n" +
                  "How much: 4 sets * 10 reps : Rest -> 50 secs",
          R.drawable.bentoverbarbell))  ;

BackD.add(new xdact_data("Dumbbell Single Arm Row",
          "Dumbbell rows are a classic move that should have a place in every self-respecting lifter's heart. Your position perched on the bench will give \n" +
                  "your lats a chance to shine, while other rear-positioned muscles like the rhomboids and traps will kick in for support.\n" +
                  "\n" +
                  "How: You only need one dumbbell to do the job here. Place it on the ground next to a bench on the side you're \n" +
                  "planning to work. Mount the bench with your weight on your opposite knee and hand, planting the same side leg on the ground. Bend at the hips, \n" +
                  "and keep your back straight, picking up the dumbbell with your work hand and allowing it to hang straight down from your shoulder.\n" +
                  "Pull the dumbbell up to the side of your torso without rotating your shoulders or losing your balance. Pause for a count at the top before lowering \n" +
                  "the weight to the starting position.\n" +
                  "\n" +
                  "How much: 4 sets * 10 reps : Rest -> 50 secs",
         R.drawable.dumbellsingle ))  ;

BackD.add(new xdact_data(" Renegade Dumbbell Row",
          "The renegade row is all about maximizing the utility of a position to the highest degree. Take two high bang-for-your-buck moves, \n" +
                  "like the plank and pushup, and make them even useful by adding more elements to work different muscle groups. Work with light dumbbells here \n" +
                  "— maintaining the proper spinal position is just as important and rowing the weight.\n" +
                  "\n" +
                  "How: Grab a pair of light dumbbells and about as much space as you would need to perform pushups. Get in a plank position with your feet spread \n" +
                  "wide, gripping the dumbbells with your palms facing parallel to each other. Squeeze your glutes and core to maintain a strong spinal alignment, looking \n" +
                  "at the floor ahead of you. Use your lats to row one of the dumbbells to chest height, then return the weight to the ground, keeping the rest of your body\n" +
                  " balanced in its position. Control the load up and down the movement — if you have to contort your body and shift your back to lift the dumbbells,\n" +
                  " drop down to a lower weight. Perform a pushup, maintaining spinal alignment, and repeat the motion with the opposite arm.\n" +
                  "\n" +
                  "How much: 4 sets * 10 reps : Rest -> 60 secs",
          R.drawable.renegade))  ;

ad5=new ExerciseDisplayAdapter(BackD);
r5.setAdapter(ad5);

//legs

        LegsD.add(new xdact_data("Squats",
                "\n" +
                        "Squats are king because they're simply the most challenging leg movement you can do, especially when loaded appropriately. \n" +
                        "They work all the lower-body musculature (we're counting glutes), and have been shown to spike muscle-building hormone release. In fact, \n" +
                        "we even know that squatting before doing curls has been shown to significantly improve arm strength.\n" +
                        "\n" +
                        "How: In a squat rack or cage, grasp the bar as far apart as is comfortable and step under it. Place it on your lower traps, squeeze your shoulder \n" +
                        "blades together, push your elbows up and nudge the bar out of the rack. Take a step or two back and stand with your feet at shoulder width and \n" +
                        "your toes turned slightly out. Take a deep breath and bend your hips back, then bend your knees to lower your body as far as you can without losing \n" +
                        "the arch in your lower back. Push your knees out as you descend. Drive vertically with your hips to come back up, continuing to push your knees out.\n" +
                        "\n" +
                        "How much: 4 sets * 10 reps : Rest -> 60 secs",
                R.drawable.barbellsquat));

  LegsD.add(new xdact_data("Front Squat",
                "Some individuals find that squats build their butts well, but they really need help building their quads. If that's you, try front squats! By shifting \n" +
                        "the bar from the back to the front of the body, even just 6-8 inches, you change the relative amount of muscle loading that occurs. Front squats \n" +
                        "emphasize the quads over the glutes and hams, which means you'll sacrifice some of the load. This movement generally requires some pretty serious \n" +
                        "upper-back and core strength to maintain a neutral spine and keep you from missing weights.\n" +
                        "\n" +
                        "How: Set a barbell on a power rack at about shoulder height. Grab the power with an overhand grip at shoulder width and raise your elbows until \n" +
                        "your upper arms are parallel to the floor. Take the bar out of the rack and let it rest on your fingertips. Your elbows should be all the way up throughout \n" +
                        "the movement. Step back and set your feet at shoulder width with toes turned out slightly. Squat as low as you can without losing the arch in your lower \n" +
                        "back.\n" +
                        "\n" +
                        "How much: 4 sets * 10 reps : Rest -> 60 secs",
                R.drawable.squat));

  LegsD.add(new xdact_data("Bulgarian Split Squat",
                "When done right, this movement is devastating to your quads. In fact, some EMG evidence suggests that 4 sets using your 10-rep max with Bulgarians \n" +
                        "aren't too different from back squats. The same study also found similar testosterone responses between Bulgarians and back squats.\n" +
                        "\n" +
                        "How: Stand lunge-length in front of a bench. Hold a dumbbell in each hand and rest the top of your left foot on the bench behind you. Lower your \n" +
                        "body until your rear knee nearly touches the floor and your front thigh is parallel to the floor. Single-leg training can yield serious strength gains. \n" +
                        "\n" +
                        "How much: 4 sets * 10 reps : Rest -> 60 secs",
                R.drawable.barbellbulgariansquat));

  LegsD.add(new xdact_data("Dumbbell Lunge",
                "Like all the movements listed thus far, multijoint lunges require hip and knee extension, which gives you the stimulus for the thighs and glutes. They can be done standing in place, or stepping forward or backward—decide for yourself which subtle variation you prefer. You can also choose between a barbell and dumbbells.\n" +
                        "\n" +
                        "How: Stand with your feet hip width, holding a dumbbell in each hand. Step forward with one leg and lower your body until your rear knee nearly touches the floor and your front thigh is parallel to the floor. Step forward with your rear leg to perform the next rep.\n" +
                        "\n" +
                        "How much: 4 sets * 10 reps : Rest -> 50 secs",
                R.drawable.dumbelllunge));

  LegsD.add(new xdact_data(" Leg Press",
                "For those of you hoping leg presses could replace squats in your leg workout, the divide between the two movements can't be overstated. Because the leg press recruits less muscle mass than squats,\n" +
                        " it simply doesn't generate the same degree of testosterone release. Nor is the body position here particularly functional, unless your log cabin collapses\n" +
                        " and your only way out is pushing the timber forward. Like hack squats, however, the leg press allows for a variety of foot positions, effectively enabling \n" +
                        "you to target weaknesses such as the teardrops or outer thighs.\n" +
                        "\n" +
                        "How: Adjust the seat of the machine so that you can sit comfortably with your hips beneath your knees and your knees in line with your feet. Remove the safeties and lower your knees toward\n" +
                        " your chest until they’re bent 90 degrees and then press back up. Be careful not to go too low or you risk your lower back coming off the seat (which can cause injury).\n" +
                        "\n" +
                        "How much: 4 sets * 10 reps : Rest -> 60 secs",
                R.drawable.legpress));

  LegsD.add(new xdact_data("Romanian Deadlift",
                "This upper hamstrings/glute exercise is unlike most others because you can really overload it. Plus, most hamstring routines focus on leg-curl movements,\n" +
                        " which center around the knee joint, but this one works from the hip joint. It's vastly underutilized in most trainees' workouts, another reason we believe\n" +
                        " it's a good fit. The Romanian deadlift is probably one of the trickiest exercises you'll ever learn to do, and learning good form is imperative.\n" +
                        "\n" +
                        "How: Hold the barbell in your hands and stand. Bend your hips back and lower your torso until you feel your lower back is about to lose its arch. \n" +
                        "Squeeze your glutes and extend your hips to come up.\n" +
                        "\n" +
                        "How much : 4 sets * 8 reps : Rest -> 60 secs",
                R.drawable.barbellromaniandeadlift));



    ad6=new ExerciseDisplayAdapter(LegsD);
    r6.setAdapter(ad6);


    //Abs

        AbsD.add(new xdact_data("Ab Wheel Rollout",
                "\n" +
                        "How: Kneel on the floor and hold an ab wheelOpens in a new Window.Opens in a new Window.Opens in a new Window.Opens in a new Window. beneath your shoulders. Brace your abs and roll the wheel forward until you feel you’re about to lose tension in your core and your hips might sag. Roll yourself back to start. Do as many reps as you can with perfect form and end the set when you think you might break form.\n" +
                        "\n" +
                        "How much: 3 sets * 10 reps : Rest -> 40 secs",
                R.drawable.abwheelrollout));

 AbsD.add(new xdact_data("Arms-High Partial Situp",
                "How: Lie on your back, knees bent at 90 degrees, and raise your arms straight overhead, keeping them pointing up throughout the exercise. Sit up halfway, then steadily return to the floor. That’s one rep.\n" +
                        "\n" +
                        "How much: 3 sets * 10 reps : Rest -> 40 secs",
                R.drawable.armshighraise));

 AbsD.add(new xdact_data("Dip/Leg Raise Combo",
                "How: Suspend yourself over the parallel bars at a dip station. Bend your knees slightly and raise your legs in front of you until they’re parallel to the floor. This will build you a magazine-worthy six-pack.\n" +
                        "\n" +
                        "How much: 3 sets * 10 reps : Rest -> 40 secs",
                R.drawable.diplegraisecombo));

 AbsD.add(new xdact_data("Leg Raise",
                "How: Lie on the floor and hold onto a benchOpens in a new Window.Opens in a new Window.Opens in a new Window.Opens in a new Window.Opens in a new Window.Opens in a new Window. or the legs of a heavy chair for support. Keep your legs straight and raise them up until they’re vertical. Lower back down, but stop just short of the floor to keep tension on your abs before the next rep.\n" +
                        "\n" +
                        "How much: 4 sets * 10 reps : Rest -> 40 secs",
                R.drawable.legraise));

 AbsD.add(new xdact_data("Pike to Superman",
                "\n" +
                        "How: Get into pushup position with your toes on the stability ball. Bend your hips and roll the ball toward you so your torso becomes vertical. Roll back so your body is straight again and extend your spine, then roll the ball up your legs so your body forms a straight line with arms extended overhead but hands still on the floor. You should look like SupermanOpens in a new Window.Opens in a new Window.Opens in a new Window.Opens in a new Window.Opens in a new Window.Opens in a new Window. flying downward. That’s one rep. Pull with your lats to return to the pushup position and begin the next rep. Here are even more ab moves that use a stability ballOpens in a new Window.Opens in a new Window.Opens in a new Window.Opens in a new Window.Opens in a new Window.Opens in a new Window..\n" +
                        "\n" +
                        "How much: 4 sets * 15 reps : Rest -> 40 secs",
                R.drawable.piketosuperman));

 AbsD.add(new xdact_data("Plank",
                "How: Get into pushup position and bend your elbows to lower your forearms to the floor. Hold the position with abs braced.\n" +
                        "\n" +
                        "How much: 2 sets * 60 secs : Rest -> 40 secs",
                R.drawable.plank));

 AbsD.add(new xdact_data("Side Plank",
                "How: Lie on your left side resting your left forearm on the floor for support. Raise your hips up so your body forms a straight line and brace your abs—your weight should be on your left forearm and the edge of your left foot. Hold the position with abs braced.\n" +
                        "\n" +
                        "How much: 2 sets * 60 secs : Rest -> 40 secs",
                R.drawable.sideplank));


r7.setAdapter(new ExerciseDisplayAdapter(AbsD));




    }
}
