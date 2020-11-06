package dicee.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button rollButton;
        rollButton = (Button) findViewById(R.id.rollButton);

        final ImageView leftDice =  (ImageView) findViewById(R.id.image_leftDice);

        final ImageView rightDice = (ImageView) findViewById(R.id.image_rightDice);

        final int [] diceArray = {
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6
        };

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random randomNumberGenerator = new Random();

                int number = randomNumberGenerator.nextInt(6);

                Log.d("mesages", "9/10/20\n" +
                        "6:36 PM\t* daemon not running; starting now at tcp:5037\n" +
                        "\n" +
                        "6:36 PM\t* daemon started successfully\n" +
                        "\n" +
                        "6:36 PM\tGradle sync started\n" +
                        "\n" +
                        "6:36 PM\tGradle sync finished in 3 s 526 ms (from cached state)\n" +
                        "\n" +
                        "6:38 PM\tExecuting tasks: [:app:assembleDebug] in project /home/obedotto/AndroidStudioProjects/dicee\n" +
                        "\n" +
                        "6:38 PM\tEmulator: queryCoreProfileSupport: swap interval not found\n" +
                        "\n" +
                        "6:38 PM\tEmulator: emulator: WARNING: UpdateCheck: Failure: Error\n" +
                        "\n" +
                        "6:38 PM\tEmulator: emulator: WARNING: UpdateCheck: Failure: Error\n" +
                        "\n" +
                        "6:38 PM\tGradle build finished in 32 s 902 ms\n" +
                        "\n" +
                        "6:38 PM\tInstall successfully finished in 3 s 473 ms.\n" +
                        "\n" +
                        "6:40 PM\tExecuting tasks: [:app:assembleDebug] in project /home/obedotto/AndroidStudioProjects/dicee\n" +
                        "\n" +
                        "6:40 PM\tGradle build finished in 3 s 198 ms\n" +
                        "\n" +
                        "6:40 PM\tInstall successfully finished in 3 s 222 ms.\n" +
                        "\n" +
                        "6:47 PM\tExecuting tasks: [:app:assembleDebug] in project /home/obedotto/AndroidStudioProjects/dicee\n" +
                        "\n" +
                        "6:47 PM\tGradle build failed in 2 s 763 ms\n" +
                        "\n" +
                        "6:47 PM\tExecuting tasks: [:app:assembleDebug] in project /home/obedotto/AndroidStudioProjects/dicee\n" +
                        "\n" +
                        "6:47 PM\tGradle build finished in 3 s 158 ms\n" +
                        "\n" +
                        "6:47 PM\tInstall successfully finished in 3 s 217 ms.\n" +
                        "\n" +
                        "6:48 PM\tExecuting tasks: [:app:assembleDebug] in project /home/obedotto/AndroidStudioProjects/dicee\n" +
                        "\n" +
                        "6:48 PM\tGradle build finished in 2 s 564 ms\n" +
                        "\n" +
                        "6:48 PM\tInstall successfully finished in 2 s 925 ms.\n" +
                        "\n" +
                        "6:51 PM\tExecuting tasks: [:app:assembleDebug] in project /home/obedotto/AndroidStudioProjects/dicee\n" +
                        "\n" +
                        "6:51 PM\tGradle build failed in 1 s 344 ms\n" +
                        "\n" +
                        "6:51 PM\tExecuting tasks: [:app:assembleDebug] in project /home/obedotto/AndroidStudioProjects/dicee\n" +
                        "\n" +
                        "6:51 PM\tGradle build finished in 2 s 126 ms\n" +
                        "\n" +
                        "6:51 PM\tInstall successfully finished in 3 s 4 ms.\n" +
                        "\n" +
                        "6:52 PM\tExecuting tasks: [:app:assembleDebug] in project /home/obedotto/AndroidStudioProjects/dicee\n" +
                        "\n" +
                        "6:52 PM\tGradle build failed in 1 s 281 ms\n" +
                        "\n" +
                        "6:52 PM\tExecuting tasks: [:app:assembleDebug] in project /home/obedotto/AndroidStudioProjects/dicee\n" +
                        "\n" +
                        "6:52 PM\tGradle build finished in 2 s 94 ms\n" +
                        "\n" +
                        "6:52 PM\tInstall successfully finished in 2 s 747 ms.\n");

                Log.w("Dicee", "the random number is: " + number);

                Log.d("message", "10/08 19:59:07: Launching '' on Nexus One API 22.\n" +
                        "$ adb shell am start -n \"dicee.com/dicee.com.MainActivity\" -a android.intent.action.MAIN -c android.intent.category.LAUNCHER\n" +
                        "Connected to process 9785 on device 'Nexus_One_API_22 [emulator-5554]'.\n" +
                        "Capturing and displaying logcat messages from application. This behavior can be disabled in the \"Logcat output\" section of the \"Debugger\" settings page.\n" +
                        "W/art: Before Android 4.1, method android.graphics.PorterDuffColorFilter androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.updateTintFilter(android.graphics.PorterDuffColorFilter, android.content.res.ColorStateList, android.graphics.PorterDuff$Mode) would have incorrectly overridden the package-private method in android.graphics.drawable.Drawable\n" +
                        "I/art: Rejecting re-init on previously-failed class java.lang.Class<androidx.core.view.ViewCompat$2>\n" +
                        "    Rejecting re-init on previously-failed class java.lang.Class<androidx.core.view.ViewCompat$2>\n" +
                        "D/OpenGLRenderer: Use EGL_SWAP_BEHAVIOR_PRESERVED: true\n" +
                        "D/: HostConnection::get() New Host Connection established 0xb40f2510, tid 9785\n" +
                        "D/Atlas: Validating map...\n" +
                        "D/: HostConnection::get() New Host Connection established 0xaecab420, tid 9801\n" +
                        "I/OpenGLRenderer: Initialized EGL, version 1.4\n" +
                        "W/OpenGLRenderer: Failed to choose config with EGL_SWAP_BEHAVIOR_PRESERVED, retrying without...\n" +
                        "D/EGL_emulation: eglCreateContext: 0xaec34be0: maj 2 min 0 rcv 2\n" +
                        "D/EGL_emulation: eglMakeCurrent: 0xaec34be0: ver 2 0 (tinfo 0xaec39330)\n" +
                        "D/OpenGLRenderer: Enabling debug mode 0\n" +
                        "D/EGL_emulation: eglMakeCurrent: 0xaec34be0: ver 2 0 (tinfo 0xaec39330)");
                Log.d("message", "9/10/20\n" +
                        "6:36 PM\t* daemon not running; starting now at tcp:5037\n" +
                        "\n" +
                        "6:36 PM\t* daemon started successfully\n" +
                        "\n" +
                        "6:36 PM\tGradle sync started\n" +
                        "\n" +
                        "6:36 PM\tGradle sync finished in 3 s 526 ms (from cached state)\n" +
                        "\n" +
                        "6:38 PM\tExecuting tasks: [:app:assembleDebug] in project /home/obedotto/AndroidStudioProjects/dicee\n");
                Log.e("error", "6:38 PM\tEmulator: queryCoreProfileSupport: swap interval not found\n" +
                        "\n" +
                        "6:38 PM\tEmulator: emulator: WARNING: UpdateCheck: Failure: Error\n" +
                        "\n" +
                        "6:38 PM\tEmulator: emulator: WARNING: UpdateCheck: Failure: Error\n");
                Log.d("message", "6:38 PM\tGradle build finished in 32 s 902 ms\n" +
                        "\n" +
                        "6:38 PM\tInstall successfully finished in 3 s 473 ms.\n" +
                        "\n" +
                        "6:40 PM\tExecuting tasks: [:app:assembleDebug] in project /home/obedotto/AndroidStudioProjects/dicee\n" +
                        "\n" +
                        "6:40 PM\tGradle build finished in 3 s 198 ms\n" +
                        "\n" +
                        "6:40 PM\tInstall successfully finished in 3 s 222 ms.\n");

                Log.wtf("message", "Executing tasks: [:app:assembleDebug] in project /home/obedotto/AndroidStudioProjects/dicee\n" +
                        "\n" +
                        "> Task :app:preBuild UP-TO-DATE\n" +
                        "> Task :app:preDebugBuild UP-TO-DATE\n" +
                        "> Task :app:compileDebugAidl NO-SOURCE\n" +
                        "> Task :app:generateDebugBuildConfig UP-TO-DATE\n" +
                        "> Task :app:compileDebugRenderscript NO-SOURCE\n" +
                        "> Task :app:javaPreCompileDebug UP-TO-DATE\n" +
                        "> Task :app:generateDebugResValues UP-TO-DATE\n" +
                        "> Task :app:generateDebugResources UP-TO-DATE\n" +
                        "> Task :app:mergeDebugResources UP-TO-DATE\n" +
                        "> Task :app:createDebugCompatibleScreenManifests UP-TO-DATE\n" +
                        "> Task :app:extractDeepLinksDebug UP-TO-DATE\n" +
                        "> Task :app:processDebugManifest UP-TO-DATE\n" +
                        "> Task :app:processDebugResources UP-TO-DATE\n" +
                        "> Task :app:compileDebugJavaWithJavac\n" +
                        "> Task :app:compileDebugSources\n" +
                        "> Task :app:mergeDebugShaders UP-TO-DATE\n" +
                        "> Task :app:compileDebugShaders NO-SOURCE\n" +
                        "> Task :app:generateDebugAssets UP-TO-DATE\n" +
                        "> Task :app:mergeDebugAssets UP-TO-DATE\n" +
                        "> Task :app:processDebugJavaRes NO-SOURCE\n" +
                        "> Task :app:mergeDebugJavaResource UP-TO-DATE\n" +
                        "> Task :app:checkDebugDuplicateClasses UP-TO-DATE\n" +
                        "> Task :app:mergeExtDexDebug UP-TO-DATE\n" +
                        "> Task :app:mergeLibDexDebug UP-TO-DATE\n" +
                        "> Task :app:dexBuilderDebug\n" +
                        "> Task :app:mergeDebugJniLibFolders UP-TO-DATE\n" +
                        "> Task :app:mergeDebugNativeLibs UP-TO-DATE\n" +
                        "> Task :app:stripDebugDebugSymbols NO-SOURCE\n" +
                        "> Task :app:validateSigningDebug UP-TO-DATE\n" +
                        "> Task :app:mergeProjectDexDebug\n" +
                        "> Task :app:packageDebug\n" +
                        "> Task :app:assembleDebug\n" +
                        "\n" +
                        "BUILD SUCCESSFUL in 3s\n" +
                        "21 actionable tasks: 4 executed, 17 up-to-date\n" +
                        "\n" +
                        "Build Analyzer results available");

                Log.wtf("logcat", "10-09 18:48:58.385 13639-13639/? E/libprocessgroup: failed to make and chown /acct/uid_10063: Read-only file system\n" +
                        "10-09 18:48:58.385 13639-13639/? W/Zygote: createProcessGroup failed, kernel missing CONFIG_CGROUP_CPUACCT?\n" +
                        "10-09 18:48:58.385 13639-13639/? I/art: Not late-enabling -Xcheck:jni (already on)\n" +
                        "10-09 18:48:58.485 13639-13639/dicee.com W/art: Before Android 4.1, method android.graphics.PorterDuffColorFilter androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.updateTintFilter(android.graphics.PorterDuffColorFilter, android.content.res.ColorStateList, android.graphics.PorterDuff$Mode) would have incorrectly overridden the package-private method in android.graphics.drawable.Drawable\n" +
                        "10-09 18:48:58.520 13639-13639/dicee.com I/art: Rejecting re-init on previously-failed class java.lang.Class<androidx.core.view.ViewCompat$2>\n" +
                        "10-09 18:48:58.520 13639-13639/dicee.com I/art: Rejecting re-init on previously-failed class java.lang.Class<androidx.core.view.ViewCompat$2>\n" +
                        "10-09 18:48:58.599 13639-13656/dicee.com D/OpenGLRenderer: Use EGL_SWAP_BEHAVIOR_PRESERVED: true\n" +
                        "10-09 18:48:58.602 13639-13639/dicee.com D/Atlas: Validating map...\n" +
                        "10-09 18:48:58.655 13639-13656/dicee.com I/OpenGLRenderer: Initialized EGL, version 1.4\n" +
                        "10-09 18:48:58.660 13639-13656/dicee.com W/OpenGLRenderer: Failed to choose config with EGL_SWAP_BEHAVIOR_PRESERVED, retrying without...\n" +
                        "10-09 18:48:58.663 13639-13656/dicee.com D/EGL_emulation: eglCreateContext: 0xb41db940: maj 2 min 0 rcv 2\n" +
                        "10-09 18:48:58.666 13639-13656/dicee.com D/EGL_emulation: eglMakeCurrent: 0xb41db940: ver 2 0 (tinfo 0xb4240b90)\n" +
                        "10-09 18:48:58.669 13639-13656/dicee.com D/OpenGLRenderer: Enabling debug mode 0\n" +
                        "10-09 18:48:58.678 13639-13656/dicee.com D/EGL_emulation: eglMakeCurrent: 0xb41db940: ver 2 0 (tinfo 0xb4240b90)\n" +
                        "10-09 18:49:06.803 13639-13639/dicee.com W/Dicee: the random number is: 2\n" +
                        "10-09 18:49:06.803 13639-13639/dicee.com D/message: 10/08 19:59:07: Launching 'app' on Nexus One API 22.\n" +
                        "    $ adb shell am start -n \"dicee.com/dicee.com.MainActivity\" -a android.intent.action.MAIN -c android.intent.category.LAUNCHER\n" +
                        "    Connected to process 9785 on device 'Nexus_One_API_22 [emulator-5554]'.\n" +
                        "    Capturing and displaying logcat messages from application. This behavior can be disabled in the \"Logcat output\" section of the \"Debugger\" settings page.\n" +
                        "    W/art: Before Android 4.1, method android.graphics.PorterDuffColorFilter androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.updateTintFilter(android.graphics.PorterDuffColorFilter, android.content.res.ColorStateList, android.graphics.PorterDuff$Mode) would have incorrectly overridden the package-private method in android.graphics.drawable.Drawable\n" +
                        "    I/art: Rejecting re-init on previously-failed class java.lang.Class<androidx.core.view.ViewCompat$2>\n" +
                        "        Rejecting re-init on previously-failed class java.lang.Class<androidx.core.view.ViewCompat$2>\n" +
                        "    D/OpenGLRenderer: Use EGL_SWAP_BEHAVIOR_PRESERVED: true\n" +
                        "    D/: HostConnection::get() New Host Connection established 0xb40f2510, tid 9785\n" +
                        "    D/Atlas: Validating map...\n" +
                        "    D/: HostConnection::get() New Host Connection established 0xaecab420, tid 9801\n" +
                        "    I/OpenGLRenderer: Initialized EGL, version 1.4\n" +
                        "    W/OpenGLRenderer: Failed to choose config with EGL_SWAP_BEHAVIOR_PRESERVED, retrying without...\n" +
                        "    D/EGL_emulation: eglCreateContext: 0xaec34be0: maj 2 min 0 rcv 2\n" +
                        "    D/EGL_emulation: eglMakeCurrent: 0xaec34be0: ver 2 0 (tinfo 0xaec39330)\n" +
                        "    D/OpenGLRenderer: Enabling debug mode 0\n" +
                        "    D/EGL_emulation: eglMakeCurrent: 0xaec34be0: ver 2 0 (tinfo 0xaec39330)\n" +
                        "10-09 18:49:06.803 13639-13639/dicee.com D/message: 9/10/20\n" +
                        "    6:36 PM\t* daemon not running; starting now at tcp:5037\n" +
                        "    \n" +
                        "    6:36 PM\t* daemon started successfully\n" +
                        "    \n" +
                        "    6:36 PM\tGradle sync started\n" +
                        "    \n" +
                        "    6:36 PM\tGradle sync finished in 3 s 526 ms (from cached state)\n" +
                        "    \n" +
                        "    6:38 PM\tExecuting tasks: [:app:assembleDebug] in project /home/obedotto/AndroidStudioProjects/dicee\n" +
                        "10-09 18:49:06.803 13639-13639/dicee.com E/error: 6:38 PM\tEmulator: queryCoreProfileSupport: swap interval not found\n" +
                        "    \n" +
                        "    6:38 PM\tEmulator: emulator: WARNING: UpdateCheck: Failure: Error\n" +
                        "    \n" +
                        "    6:38 PM\tEmulator: emulator: WARNING: UpdateCheck: Failure: Error\n" +
                        "10-09 18:49:06.803 13639-13639/dicee.com D/message: 6:38 PM\tGradle build finished in 32 s 902 ms\n" +
                        "    \n" +
                        "    6:38 PM\tInstall successfully finished in 3 s 473 ms.\n" +
                        "    \n" +
                        "    6:40 PM\tExecuting tasks: [:app:assembleDebug] in project /home/obedotto/AndroidStudioProjects/dicee\n" +
                        "    \n" +
                        "    6:40 PM\tGradle build finished in 3 s 198 ms\n" +
                        "    \n" +
                        "    6:40 PM\tInstall successfully finished in 3 s 222 ms.\n" +
                        "10-09 18:49:06.803 13639-13639/dicee.com A/message: Executing tasks: [:app:assembleDebug] in project /home/obedotto/AndroidStudioProjects/dicee\n" +
                        "    \n" +
                        "    > Task :app:preBuild UP-TO-DATE\n" +
                        "    > Task :app:preDebugBuild UP-TO-DATE\n" +
                        "    > Task :app:compileDebugAidl NO-SOURCE\n" +
                        "    > Task :app:generateDebugBuildConfig UP-TO-DATE\n" +
                        "    > Task :app:compileDebugRenderscript NO-SOURCE\n" +
                        "    > Task :app:javaPreCompileDebug UP-TO-DATE\n" +
                        "    > Task :app:generateDebugResValues UP-TO-DATE\n" +
                        "    > Task :app:generateDebugResources UP-TO-DATE\n" +
                        "    > Task :app:mergeDebugResources UP-TO-DATE\n" +
                        "    > Task :app:createDebugCompatibleScreenManifests UP-TO-DATE\n" +
                        "    > Task :app:extractDeepLinksDebug UP-TO-DATE\n" +
                        "    > Task :app:processDebugManifest UP-TO-DATE\n" +
                        "    > Task :app:processDebugResources UP-TO-DATE\n" +
                        "    > Task :app:compileDebugJavaWithJavac\n" +
                        "    > Task :app:compileDebugSources\n" +
                        "    > Task :app:mergeDebugShaders UP-TO-DATE\n" +
                        "    > Task :app:compileDebugShaders NO-SOURCE\n" +
                        "    > Task :app:generateDebugAssets UP-TO-DATE\n" +
                        "    > Task :app:mergeDebugAssets UP-TO-DATE\n" +
                        "    > Task :app:processDebugJavaRes NO-SOURCE\n" +
                        "    > Task :app:mergeDebugJavaResource UP-TO-DATE\n" +
                        "    > Task :app:checkDebugDuplicateClasses UP-TO-DATE\n" +
                        "    > Task :app:mergeExtDexDebug UP-TO-DATE\n" +
                        "    > Task :app:mergeLibDexDebug UP-TO-DATE\n" +
                        "    > Task :app:dexBuilderDebug\n" +
                        "    > Task :app:mergeDebugJniLibFolders UP-TO-DATE\n" +
                        "    > Task :app:mergeDebugNativeLibs UP-TO-DATE\n" +
                        "    > Task :app:stripDebugDebugSymbols NO-SOURCE\n" +
                        "    > Task :app:validateSigningDebug UP-TO-DATE\n" +
                        "    > Task :app:mergeProjectDexDebug\n" +
                        "    > Task :app:packageDebug\n" +
                        "    > Task :app:assembleDebug\n" +
                        "    \n" +
                        "    BUILD SUCCESSFUL in 3s\n" +
                        "    21 actionable tasks: 4 executed, 17 up-to-date\n" +
                        "    \n" +
                        "    Build Analyzer results available");
                Log.wtf("git cloneing", "data");
                Log.wtf("data werefing", "androidStudio");
                Log.wtf("data cloning", "android studio");
                Log.wtf("", "installing..");
                Log.wtf("", "######################################################\n" +
                        "#####################################################\n######################################################\n#################################\n#################################\n#############################################\n#####################################################################################################################################################################################################################################################################################################################################################################################################\n######################################################\n#################################\n#################################\n#############################################\n#####################################################################################################################################################################################################################################################################################################################################################################################################\n######################################################\n#################################\n#################################\n#############################################\n#####################################################################################################################################################################################################################################################################################################################################################################################################\n######################################################\n#################################\n#################################\n#############################################\n#####################################################################################################################################################################################################################################################################################################################################################################################################\n######################################################\n#################################\n#################################\n#############################################\n#####################################################################################################################################################################################################################################################################################################################################################################################################\n######################################################\n#################################\n#################################\n#############################################\n##################################################################");
                Log.wtf("", "creating..\ncreating user..\ncreating env");




                leftDice.setImageResource(diceArray[number]);

                number = randomNumberGenerator.nextInt(6);

                rightDice.setImageResource(diceArray[number]);

            }
        });
    }
}

// javaProgram 2 video