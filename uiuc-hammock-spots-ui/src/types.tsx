export interface StoreState {
  minimum_tree_distance: number
  maximum_tree_distance: number
  trees: Tree[]
}

export interface Tree {
  cultivarAbbreviation: string
  dbh: number
  inventoryDate: string
  latitude: number
  longitude: number
  multistem: boolean
  nearestBuilding: string
  siteChangeDate: string
  siteChangeTime: string
  siteComments: string
  siteId: number
  siteLastChangeBy: string
  species: string
  x: number
  y: number
}

export interface TreeDistance {
  site1_id: number
  site2_id: number
  distance: number
}
