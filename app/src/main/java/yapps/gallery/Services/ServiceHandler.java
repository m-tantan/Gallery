package yapps.gallery.Services;

import yapps.gallery.Data;

public class ServiceHandler
{
    class ResponseData{
        private Data data = null;

        public Data getData()
        {
            return data;
        }

        public void setData(Data data)
        {
            this.data = data;
        }
    }

    public interface ServiceResponse{
        void getResult(Data data);
    }
}
