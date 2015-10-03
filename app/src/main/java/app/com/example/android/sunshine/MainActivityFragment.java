package app.com.example.android.sunshine;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    private ArrayAdapter<String> mForeCastAdapter;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        String[] forecastArray = {
                "Today - Sunny- 88/63",
                "Tomorrow - Rainy -73/44",
                "Wendsday Snowy -10/-3",
                "Thursday Tsunami - 44/44",
                "Friday rain - 73/44",
                "Sat rain - 44/34",
                "Sun sunny 99/99"
        };
        List<String> weekForecast = new ArrayList<String>(
                Arrays.asList(forecastArray));

        mForeCastAdapter = new ArrayAdapter<String>(
                getActivity(),
                R.layout.list_item_forecast,
                R.id.list_item_forecast_textview,
                weekForecast);

        ListView listView = (ListView) rootView.findViewById(
                R.id.listview_forecast);
        listView.setAdapter(mForeCastAdapter);

        return rootView;
    }
}
