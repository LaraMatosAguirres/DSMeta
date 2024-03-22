import AvatarIcon from "../../assets/img/avatar-icon 1.svg";
import "./styles.css";

function NotificationButton() {
  return (
    <div className="dsmeta-red-btn">
      <img src={AvatarIcon} alt="Notificar" />
    </div>
  );
}

export default NotificationButton;
