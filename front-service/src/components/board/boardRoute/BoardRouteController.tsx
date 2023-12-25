import { Route, Routes } from "react-router-dom"
import React from "react"
import BoardMain from "./BoardMain"
import BoardBody from "../BoardBody"
import CreateBoard from "../createBoard/CreateBoard"
import BoardDetail from "../boardDetail/BoardDetail"
import Authentication from "../../user/authentication";

const BoardRouteController = () => {
    return(
        <Routes>
            <Route path="/" element={<Authentication/>}/>
            <Route path="/boards" element={<BoardBody/>}>
                <Route path="/boards" element={<BoardMain/>}/>
                <Route path="/boards/write" element={<CreateBoard/>}/>
                <Route path="/boards/:boardUUID" element={<BoardDetail />}/>
            </Route>
        </Routes>
    )
}
export default BoardRouteController