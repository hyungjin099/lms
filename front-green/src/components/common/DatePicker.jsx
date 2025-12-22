// components/BasicDatePicker.jsx
import React from 'react';
import Flatpickr from 'react-flatpickr';
import "flatpickr/dist/themes/material_orange.css"
import { Korean } from "flatpickr/dist/l10n/ko.js";
import styles from './DatePicker.module.css'
import { FaCalendar } from "react-icons/fa6";
import { formatDateToString } from "../../util/dateUtil";
import { IoCheckmarkCircleOutline, IoAlertCircleOutline } from "react-icons/io5";

const DatePicker = ({ 
  label,
  options = {},
  name, 
  value,
  onChange,
  error,
  touched,
  isValid,
  required,
  ...props 
}) => {

  const defaultOptions = {
    dateFormat: 'Y-m-d',
    locale: Korean,
    ...options
  };

  const handleChange = (selectedDates) => {
    if (onChange) {
      const formattedValue = formatDateToString(selectedDates[0]);
      
      onChange({
        target: {
          name,
          value: formattedValue
        }
      });
    }
  };

  const getInputClass = () => {
    let className = styles.input;
    
    if (touched) {
      if (error) {
        className += ` ${styles.inputError}`;
      } else if (isValid) {
        className += ` ${styles.inputValid}`;
      }
    }
    
    return className;
  };

  return (
    <div className={styles.inputGroup}>
      {label && (
        <label htmlFor={name} className={styles.label}>
          {label}
          {required && <span className={styles.required}>*</span>}
        </label>
      )}
      
      <div className={styles.inputWrapper}>
        <FaCalendar className={styles.calendarIcon}/>
        
        <Flatpickr
          id={name}
          options={defaultOptions}
          value={value}
          onChange={handleChange}
          className={getInputClass()}
          {...props}
        />
        
        {/* 성공/에러 아이콘 */}
        {touched && (error || isValid) && (
          <div className={styles.validationIcon}>
            {error ? (
              <IoAlertCircleOutline className={styles.errorIcon}/>
            ) : isValid ? (
              <IoCheckmarkCircleOutline className={styles.successIcon}/>
            ) : null}
          </div>
        )}
      </div>
      
      {/* 에러 메시지 */}
      {touched && error && (
        <div className={styles.errorMessage}>{error}</div>
      )}
    </div>
  )
}

export default DatePicker