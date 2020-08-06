package dj.fingerprintauth;

// import android.os.Bundle;
// import io.flutter.app.FlutterFragmentActivity;
// import io.flutter.plugins.GeneratedPluginRegistrant;
import androidx.annotation.NonNull;
//import io.flutter.embedding.android.FlutterActivity
import io.flutter.embedding.android.FlutterFragmentActivity;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.plugins.GeneratedPluginRegistrant;

public class MainActivity extends FlutterFragmentActivity {
    @java.lang.Override
    public void configureFlutterEngine(FlutterEngine flutterEngine) {
        super.configureFlutterEngine(flutterEngine);
        GeneratedPluginRegistrant.registerWith(flutterEngine);
    }
}

// import io.flutter.embedding.android.FlutterFragmentActivity;
// import io.flutter.embedding.engine.FlutterEngine;
// import io.flutter.plugins.localauth.LocalAuthPlugin;

// public class MainActivity extends FlutterFragmentActivity {
// @Override
// public void configureFlutterEngine(FlutterEngine flutterEngine) {
// flutterEngine.getPlugins().add(new LocalAuthPlugin());
// }
// }

// class MainActivity: FlutterFragmentActivity() {
// override fun configureFlutterEngine(FlutterEngine flutterEngine) {
// flutterEngine.getPlugins().add(new LocalAuthPlugin())
// }
// }

// public class MainActivity extends FlutterActivity {
// @Override
// public void configureFlutterEngine(@NonNull FlutterEngine flutterEngine) {
// GeneratedPluginRegistrant.registerWith(flutterEngine);
// }
// }