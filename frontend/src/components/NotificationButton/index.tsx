import axios from "axios";
import AvatarIcon from "../../assets/img/avatar-icon 1.svg";
import "./styles.css";
import { toast } from "react-toastify";

type Props = {
    saleId: number;
}

function handleClick(id : number){
  axios('${BASE_URL}/report-sales/${id}/notification')
    .then(response => {
      toast.info("SMS enviado com sucesso")
    })

}

function NotificationButton({saleId} : Props) {
  return (
    <div className="dsmeta-red-btn" onClick={() => handleClick(saleId)}>
      <img src={AvatarIcon} alt="Notificar" />
    </div>
  );
}

export default NotificationButton;
