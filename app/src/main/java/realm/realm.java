package realm;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Environment;
import android.util.Log;

import com.example.studio.android.bo.testrealm.ContactRealm;
import com.example.studio.android.bo.testrealm.Migration;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.FileChannel;
import java.util.logging.FileHandler;

import io.realm.Realm;
import io.realm.RealmConfiguration;
import io.realm.RealmList;
import io.realm.RealmQuery;

/**
 * Created by User on 12/17/2015.
 */
public class realm {

//    private static realm INSTANCE;
//    private Context context;
//
//    RealmConfiguration realm;
//    RealmConfiguration realmAll;
//    private RealmList<ContactRealm>contactList;
//
//    private realm(Context context){
//        Log.d(this.getClass().getName(),"New Instance");
//        setContext(context);
//        setConfig();
//        setConfigAll();
//
//    }
//    private void setConfig(){
//        realm = new RealmConfiguration.Builder(getContext()).name("superchat.realm").schemaVersion(8).migration(new Migration()).build();
//    }
//    private void setConfigAll(){
//        realmAll = new RealmConfiguration.Builder(getContext()).name("superchatAll.realm").schemaVersion(8).migration(new Migration()).build();
//    }
//    public static realm getInstance(Context context){
//        if(INSTANCE == null)
//            INSTANCE = new realm(context);
//
//        return INSTANCE;
//    }
//    public RealmConfiguration getConfig(){
//        return realm;
//    }
//    public RealmConfiguration getConfigAll(){
//        return realmAll;
//    }
//    public void setRealm(RealmConfiguration realm){
//        this.realm = realm;
//    }
//    pulic void setRealmAll(RealmConfiguration realmAll){
//        this.realmAll = realmAll;
//    }
//
//    public Context getContext(){
//        return context;
//    }
//    public void setContext(Context context){
//        this.context = context;
//    }
//    public void exportDatabase(){
//        try{
//            File sd = Environment.getExternalStorageDirectory();
//            if(sd.canWrite()){
//                String exPath = Environment.getExternalStorageDirectory()+ "/superchat/data/";
//                File folder = new File(exPath);
//                boolean success = true;
//                if(!folder.exists()){
//                    success = folder.mkdir();
//                }
//                if(success){
//                    File currentD = new File(realm.getPath());
//                    File backupDB = new File(exPath + currentD.getName());
//                    if (currentD.exists()){
//                        FileChannel src = new FileInputStream(currentD).getChannel();
//                        FileChannel dst = new FileInputStream(backupDB).getChannel();
//                        dst.transferFrom(src,0,src.size());
//                    }
//
//                }
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//            Log.d(this.getClass().getName(), e.getMessage());
//        }
//    }
//    public void importDatabase(String filePath){
//        try{
//            File sd = Environment.getExternalStorageDirectory();
//            if(sd.canWrite()){
//                File currentD = new File(realm.getPath());
//                byte[] buffer = new byte[1024];
//                int length;
//                InputStream myInput = getContext().getAssets().open(filePath);
//                OutputStream myOutput = new FileOutputStream(currentD);
//                while ((length = myInput.read(buffer))>0){
//                    myOutput.write(buffer, 0, length);
//                }
//                myOutput.close();
//                myOutput.flush();
//                myInput.close();
//            }
//        }catch (Exception e){
//            Log.d(this.getClass().getSimpleName(), e.getMessage());
//        }
//    }
//    public void changePresent(String socialId, int presentID){
//        changePresent(socialId, presentID, null);
//    }
//    public void changePresent(final String socialId, int presentID, final OnchangePresentCallBack callBack){
//        new AsyncTask<String, Void, String>(){
//            @Override
//            protected String doInBackground(String... params) {
//                String socialId = params[0];
//                int presentID = Integer.parseInt(params[1]);
//                Realm realmAll = Realm.getInstance(getConfigAll());
//                realmAll.beginTransaction();;
//                try{
//                    RealmQuery<ContactRealm> queryAll = realmAll.where(ContactRealm.class);
//                    queryAll.equalTo("contactId",socialId);
//                }
//                return socialId;
//            }
//        }.execute(socialId, String.valueOf(presentID));
//    }
//




}
