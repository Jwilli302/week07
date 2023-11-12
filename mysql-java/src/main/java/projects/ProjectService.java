package projects;

import java.util.List;
import java.util.NoSuchElementException;

import projects.dao.ProjectDao;
import projects.entity.Project;

	
	public class ProjectService {
		private ProjectDao projectDao = new ProjectDao();
		
	public List<Project> fetchAllProjects() {
		
		return projectDao.fetchAllProjects();
	}
	
	public Project fetchProjectById(Integer projectId) {
		return projectDao.fetchProjectById(projectId).orElseThrow(() -> new NoSuchElementException(
				"Project with projectId" + projectId + " does not exist"));
	}
	
	
	
		public Project addProject(Project project) {
			return projectDao.insertProject(project);
		}
	}
	
