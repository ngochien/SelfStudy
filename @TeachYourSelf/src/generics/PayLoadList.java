package generics;

import java.util.List;

interface PayloadList<E,P> extends List<E> {
  void setPayload(int index, P val);

}