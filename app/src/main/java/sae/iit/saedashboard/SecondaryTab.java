package sae.iit.saedashboard;
import android.content.*;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import androidx.core.content.FileProvider;
import androidx.fragment.app.Fragment;

import android.widget.TextView;
import android.net.Uri;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import android.content.BroadcastReceiver;
import android.content.Context;



public class SecondaryTab extends Fragment {
	private static TextView rightMotorTemp, leftMotorTemp, rightMotorContTemp, leftMotorContTemp, activeAeroPos, DCBusCurrent;
	//============================

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
							 Bundle savedInstanceState) {
		ViewGroup rootView = (ViewGroup) inflater.inflate(
				R.layout.secondary_tab, container, false);


		//Initializing Fields
		rightMotorTemp = rootView.findViewById(R.id.rightMotorTemp);
		leftMotorTemp = rootView.findViewById(R.id.leftMotorTemp);
		rightMotorContTemp = rootView.findViewById(R.id.rightMotorContTemp);
		leftMotorContTemp = rootView.findViewById(R.id.leftMotorContTemp);
		activeAeroPos = rootView.findViewById(R.id.activeAeroPos);
		DCBusCurrent = rootView.findViewById(R.id.DCBusCurrent);
		return rootView;
	}

	public static void setLeftMotorTemp(String LMT){ leftMotorTemp.setText((CharSequence)LMT); }
	public static void setRightMotorTemp(String RMT){ rightMotorTemp.setText((CharSequence)RMT); }
	public static void setLeftMotorContTemp(String LMCT){ leftMotorContTemp.setText((CharSequence)LMCT); }
	public static void setRightMotorContTemp(String RMCT){ rightMotorContTemp.setText((CharSequence)RMCT); }
	public static void setActiveAeroPos(String AAP){ activeAeroPos.setText((CharSequence)AAP); }
	public static void setDCBusCurrent(String DCBC){ DCBusCurrent.setText((CharSequence)DCBC); }



}
