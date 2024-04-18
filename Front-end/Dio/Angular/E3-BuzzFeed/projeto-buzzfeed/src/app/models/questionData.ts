export interface Question{
  id:number;
  question:string;
  options: Option[];
}

interface Option{
  id:number;
  name:string;
  alias:string;
}