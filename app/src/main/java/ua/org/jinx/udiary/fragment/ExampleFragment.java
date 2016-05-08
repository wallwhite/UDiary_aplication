package ua.org.jinx.udiary.fragment;


import android.content.Context;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import ua.org.jinx.udiary.R;
import ua.org.jinx.udiary.adapter.UDlistAdapter;
import ua.org.jinx.udiary.dto.UDiaryDTO;

public class ExampleFragment extends AbstractTabFragment {
    private static final int LAYOUT_TASK = R.layout.fragment_example;

    public static ExampleFragment getInstance(Context context)
    {
        Bundle args = new Bundle();

        ExampleFragment fragment = new ExampleFragment();
        fragment.setArguments(args);
        fragment.setContext(context);
        fragment.setLayoutTitle(context.getString(R.string.tabs_now));
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(LAYOUT_TASK , container , false);

        RecyclerView rv = (RecyclerView) view.findViewById(R.id.recycleView);
        rv.setLayoutManager(new LinearLayoutManager(context));//если что то завалится попробовать сделать как в библиотеке что скачал
        rv.setAdapter(new UDlistAdapter(createMockUDListData()));
        return view;
    }

    private List<UDiaryDTO> createMockUDListData() {
        List<UDiaryDTO> data = new ArrayList<>();


        data.add(new UDiaryDTO("Задание на вторник","25", "Сделать что то..."));
        data.add(new UDiaryDTO("ЖОПА","01" ,"По постилу ууужас"));
        data.add(new UDiaryDTO("БЖД" ,"12" ,"Цимбалюк очко рвет"));
        data.add(new UDiaryDTO("Диплом","05" ,"Пиздец а не диплом"));
        data.add(new UDiaryDTO("Диплом","05" ,"Пиздец а не диплом"));
        data.add(new UDiaryDTO("Диплом","05" ,"Пиздец а не диплом"));
        data.add(new UDiaryDTO("Диплом","05" ,"Пиздец а не диплом"));
        data.add(new UDiaryDTO("Диплом","05" ,"Пиздец а не диплом"));
        data.add(new UDiaryDTO("Диплом","05" ,"Пиздец а не диплом"));
        data.add(new UDiaryDTO("Диплом","05" ,"Пиздец а не диплом"));

        return data;
    }
    public void setContext(Context context) {
        this.context = context;
    }


}
